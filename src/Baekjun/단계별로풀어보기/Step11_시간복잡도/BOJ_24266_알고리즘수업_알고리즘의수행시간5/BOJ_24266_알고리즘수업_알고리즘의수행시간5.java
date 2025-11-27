package Baekjun.단계별로풀어보기.Step11_시간복잡도.BOJ_24266_알고리즘수업_알고리즘의수행시간5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24266_알고리즘수업_알고리즘의수행시간5 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long a = (long) n * n * n;
        System.out.println(a + "\n" + "3");
    }
}