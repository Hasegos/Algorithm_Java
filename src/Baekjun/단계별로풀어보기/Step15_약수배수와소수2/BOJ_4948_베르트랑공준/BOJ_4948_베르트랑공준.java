package Baekjun.단계별로풀어보기.Step15_약수배수와소수2.BOJ_4948_베르트랑공준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948_베르트랑공준 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                break;
            }
            int result =  isPrime(2 * n) - isPrime(n);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

    public static int isPrime(int n){
        boolean[] arr = new boolean[n + 1];
        int count = 0;
        for(int i = 2; i <= n; i++){
            arr[i] = true;
        }

        for(int i = 2; i * i <= n; i++){
            if(arr[i]){
                for(int j = i * i; j <= n; j += i){
                    arr[j] = false;
                }
            }
        }
        for(int i = 2; i < arr.length; i++){
            if(arr[i]){
                count ++;
            }
        }
        return count;
    }
}