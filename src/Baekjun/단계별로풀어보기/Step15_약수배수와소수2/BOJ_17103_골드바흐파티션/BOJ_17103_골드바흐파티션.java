package Baekjun.단계별로풀어보기.Step15_약수배수와소수2.BOJ_17103_골드바흐파티션;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17103_골드바흐파티션 {

    static boolean[] arr = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());
        for(int i = 0; i < T; i++){
            sb.append(isPrime(Integer.parseInt(bf.readLine()))).append("\n");
        }
        System.out.println(sb);
    }

    public static int isPrime(int n){
        for (int i = 2; i <= n; i++){
            arr[i] = true;
        }

        for(int i = 2; i * i <= n; i++){
            if(arr[i]){
                for(int j = i * i; j <= n; j+= i){
                    arr[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 2; i <= n / 2; i++){
            if(arr[i] && arr[n - i]){
                count++;
            }
        }
        return count;
    }
}