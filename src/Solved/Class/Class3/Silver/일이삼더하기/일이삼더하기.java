package Solved.Class.Class3.Silver.일이삼더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일이삼더하기 {

    /* ––––– 전체 n의 최댓값은 11이다. ––––– */
    static int dp[] = new int[11];
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T =  Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++){
            int a = Integer.parseInt(bf.readLine());
            sb.append(add(a)).append("\n");
        }
        System.out.println(sb);
    }

    /* ––––– 합산 프로세서 ––––– */
    public static int add(int a){
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        /* i값의 증가에 따라 값이 추가된다.
        * ex) 5
        *   1 -> 2 -> 4 -> 7 -> 13
        *  해당 값처럼 누적으로 값이 오른다.
        * */

        for(int i = 4; i <= a; i++){
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
        return dp[a];
    }
}