package Solved.Class.Class3.Silver.피보나치함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수 {

    static int[] topDown;
    public static void main(String[] args) throws IOException {

        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            int a = Integer.parseInt(bf.readLine());
            /* ––––– 0일 경우와 1일 경우  ––––– */
            if(a == 0) {
                sb.append(1 + " ").append(0 + "\n");
            }
            else if(a == 1){
                sb.append(0 + " ").append(1 + "\n");
            }
            else{
                /* ––––– 입력받은 값이 2이상일 경우  ––––– */
                topDown = new int[a + 1];
                int length = topDown.length;
                fibonacci(a);
                sb.append(topDown[length - 2] + " ").append(topDown[length - 1] + "\n");
            }
        }
        System.out.println(sb);
    }

    /* ––––– Top to Down  ––––– */
    public static int fibonacci(int n){
        if(n < 2) return topDown[n] = n;
        // 해당 값이 존재할 경우
        if(topDown[n] != 0) return topDown[n];
        // 0 과 1이 몇번 사용되었는지 합산
        topDown[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return topDown[n];
    }
}