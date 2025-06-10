package Solved.Class.Class3.Silver.FourSquares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourSquares {

    static int [] arr = new int[50004];
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        dp(N);
    }
    /* ––––– 해당 수가되는 최소 제곱수의 개수 구하기 ––––– */
    public static void dp(int N){
        for(int i = 1; i<= N; i++){
            arr[i] = arr[i-1] + 1;
            for(int j = 1; j * j <= i; j++){
                /* ––––– 순차적으로 올라가면서 제곱수되는 경우 -> 1개임 ––––– */
                arr[i] = Math.min(arr[i],arr[i - (j * j)] + 1);
            }
        }
        System.out.println(arr[N]);
    }
}