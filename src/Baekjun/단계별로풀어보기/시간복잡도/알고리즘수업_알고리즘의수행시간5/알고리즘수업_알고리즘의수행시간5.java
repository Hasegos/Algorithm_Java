package Baekjun.단계별로풀어보기.시간복잡도.알고리즘수업_알고리즘의수행시간5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수업_알고리즘의수행시간5 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long a = (long) n * n * n;
        System.out.println(a + "\n" + "3");
    }
}