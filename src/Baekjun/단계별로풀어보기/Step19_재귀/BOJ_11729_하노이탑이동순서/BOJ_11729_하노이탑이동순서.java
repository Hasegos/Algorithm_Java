package Baekjun.단계별로풀어보기.Step19_재귀.BOJ_11729_하노이탑이동순서;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11729_하노이탑이동순서 {

    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        sb.append((int)Math.pow(2,N) - 1).append("\n");
        recursion(N,1,2,3);
        System.out.println(sb);
    }

    public static void recursion(int N, int start, int mid, int end){
        if(N == 1){
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        recursion(N - 1 ,start , end, mid);
        sb.append(start).append(" ").append(end).append("\n");
        recursion(N - 1, mid, start, end);
    }
}