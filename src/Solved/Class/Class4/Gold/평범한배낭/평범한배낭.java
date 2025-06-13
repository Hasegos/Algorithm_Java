package Solved.Class.Class4.Gold.평범한배낭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평범한배낭 {

    static int[][] arr; // 입력 배열 저장
    static int[][] dp; // 가치 저장
    static int N, K;
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][2];        
        dp = new int[N + 1][K + 1];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        backpack();
        System.out.println(dp[N][K]);
    }

    /* ––––– 배낭 무게에 대한 가치 파악 ––––– */
    public static void backpack(){

        for(int i = 1; i <= N; i++){ // 물건 개수
            for(int j = 1; j <= K; j++){ // 물건에 대한 무게

                // 무게가 초과일때 gg
                if(arr[i][0] > j){
                    dp[i][j] = dp[i-1][j];
                }
                /* ––––– i번째 물건을 안넣은 가치 vs 넣었을 가치–––– */
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - arr[i][0]] + arr[i][1]);
                }
            }
        }
    }
}