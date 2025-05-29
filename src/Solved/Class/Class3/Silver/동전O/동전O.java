package Solved.Class.Class3.Silver.동전O;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 동전O {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");

        int N = Integer.parseInt(input[0]); // N개의 종류
        int M = Integer.parseInt(input[1]); // 맞춰야하는 K값

        int[] inputArr = new int[N];
        for(int i = 0; i < inputArr.length; i++){
            inputArr[i] = Integer.parseInt(bf.readLine());
        }

        /* ––––– 동전의 종류들중에서 최소의 개수로 맞출수있는 값 찾기 ––––– */
        int count = 0;
        StringBuilder sb = new StringBuilder();

        // 최소의 개수를 찾기위해 가장 큰값부터 나누기
        for(int i = inputArr.length - 1; i >= 0; i--){
            count += M / inputArr[i];
            M %= inputArr[i];
        }
        sb.append(count);
        System.out.println(sb);
    }
}