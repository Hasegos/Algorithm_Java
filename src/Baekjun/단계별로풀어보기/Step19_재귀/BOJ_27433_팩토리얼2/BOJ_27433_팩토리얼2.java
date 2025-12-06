package Baekjun.단계별로풀어보기.Step19_재귀.BOJ_27433_팩토리얼2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27433_팩토리얼2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        long result = 1;
        for(int i = 1; i <= N; i++){
            result *= i;
        }
        sb.append(result);
        System.out.println(sb);
    }
}