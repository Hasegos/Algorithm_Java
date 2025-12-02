package Baekjun.단계별로풀어보기.Step17_조합론.다리놓기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다리놓기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            String[] s  = bf.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);

            long answer = factorial(m, n);
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    public static long factorial(int m, int n){
        long answer = 1;
        int j = 1;
        for(int i = n + 1; i <= m; i++){
            answer *= i;
            answer /= j;
            j++;
        }
        return answer;
    }
}