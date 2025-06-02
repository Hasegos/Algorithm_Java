package Solved.Class.Class3.Silver.계단오르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {

    static int[] dp;
    static int[] arr;
    public static void main(String[] args) throws IOException {

        /* ----- 사용자로부터 입력 ----- */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        /* ----- 1부터 시작할거기에 T + 1 개의 배열 생성 ----- */
        dp = new int[T + 1];
        arr = new int[T + 1];
        for(int i = 1; i <= T; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        System.out.println(result(T));
    }

    public static int result(int T){
        dp[1] = arr[1];

        if(T >= 2){
            dp[2] = arr[1] + arr[2];
        }
        /* ----- 계단을 3개 연속 X ----- */
        /*  n-3 / n-2 / n-1 / n 일때
        *
        * 최종으로 갈수있는 방법은 총 두가지이다.
        *
        * 1번 : n-3 + n-1 + n
        * 2번 : n-3 + n-2 + n
        *
        * 이렇게 두가지가 나온다.
        *
        * 이중에서 n-2까지의 값과 n-1까지의 값중에서 가장 큰값을 고르고
        * n을 더해주면 해당 n의 최댓값이다.
        * */
        for(int i = 3; i <= T; i++){
           dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i-1]) + arr[i];
        }
        return dp[T];
    }
}