package Baekjun.단계별로풀어보기.Step19_재귀.BOJ_10870_피보나치수5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_10870_피보나치수5 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int a = 0, b = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for(int i = 2; i <= N; i++){
            a = a + b;
            list.add(a);
            b = a + b;
            list.add(b);
        }
        sb.append(list.get(N));
        System.out.println(sb);
    }
}