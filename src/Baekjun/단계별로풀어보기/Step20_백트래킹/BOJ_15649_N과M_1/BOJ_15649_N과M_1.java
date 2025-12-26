package Baekjun.단계별로풀어보기.Step20_백트래킹.BOJ_15649_N과M_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15649_N과M_1 {

    private static StringBuilder sb = new StringBuilder();
    private static int M, N;
    private static int[] arr;
    private static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        arr = new int[N + 1];
        check = new boolean[N + 1];

        backtracking(0);
        System.out.println(sb);
    }

    public static void backtracking(int k){
        if(k == M){
            for(int i = 0; i < M; i++){
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= N; i++){
            if(!check[i]){
                arr[k] = i;
                check[i] = true;
                backtracking(k + 1);
                check[i] = false;
            }
        }
    }
}