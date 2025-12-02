package Baekjun.단계별로풀어보기.Step17_조합론.팩토리얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        long answer = 1;
        for(int i = 1; i <= N; i++){
            answer *= i;
        }
        sb.append(answer);
        System.out.println(sb);
    }
}