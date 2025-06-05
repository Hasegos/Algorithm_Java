package Solved.Class.Class3.Silver.파도반수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파도반수열 {

    static long dp[] = new long[101];
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        
        /* ––––– P(N) ––––– */
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(bf.readLine()); 
            sb.append(add(N)).append("\n");
        }
        System.out.println(sb);
    }
    /* ––––– P(N) 계산 ––––– */
    public static long add(int N){
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        /*
        * 1 ~ 5 까지는 규칙이 따로없다.
        * 이제 6부터 나타나는데, 1) 3 = 1 + 2
        * 2) 4 = 1 + 3 , 3)  5 = 1 + 4, 4) 7 = 5 + 2 등... 형식으로 나타난다.
        *
        * 6번째의 경우는 1번째 경우와 5번째의 경우를 더한 결과이다.
        * 이 규칙을 갖고 누적값을 만들고 N 번째의 값을 반환하면된다.
        * */
        for(int i = 6; i<=N; i++){
            dp[i] = dp[i - 5] + dp[i - 1];
        }
        return dp[N];
    }
}