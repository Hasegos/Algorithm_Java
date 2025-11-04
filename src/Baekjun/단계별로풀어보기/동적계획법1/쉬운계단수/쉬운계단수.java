package Baekjun.단계별로풀어보기.동적계획법1.쉬운계단수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쉬운계단수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        solution(n);
    }

    public static void solution(int n){
        long answer = 0;
        int mod = 1000000000;
        int[][] dp = new int[n + 1][10];

        for(int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= 9; j ++){
                if(j == 0){
                    dp[i][j] = dp[i-1][j + 1];
                }
                else if(j == 9){
                    dp[i][j] = dp[i-1][j - 1];
                }
                else{
                    dp[i][j] = dp[i - 1][j + 1] + dp[i - 1][j-1];
                }
                dp[i][j] %= mod;
            }
        }
        for(int i = 0; i <= 9; i++){
            answer += dp[n][i];
        }
        System.out.println(answer % mod);
    }
}