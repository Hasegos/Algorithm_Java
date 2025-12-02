package Baekjun.단계별로풀어보기.Step17_조합론.BOJ_15439_베라의패션;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15439_베라의패션 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        if(N == 1){
            sb.append("0");
        }
        else{
            sb.append((N - 1) * N);
        }
        System.out.println(sb);
    }
}