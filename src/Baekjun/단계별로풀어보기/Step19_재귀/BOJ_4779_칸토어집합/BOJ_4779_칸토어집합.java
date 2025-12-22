package Baekjun.단계별로풀어보기.Step19_재귀.BOJ_4779_칸토어집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4779_칸토어집합 {

    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = bf.readLine()) != null && !s.isEmpty()){
            int n = Integer.parseInt(s);
            recursion(n);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void recursion(int n){
        int size = (int)Math.pow(3,n - 1);

        if(n == 0){
            sb.append("-");
            return;
        }
        recursion(n - 1);
        for(int i = 0; i < size; i++){
            sb.append(" ");
        }
        recursion(n - 1);
    }
}