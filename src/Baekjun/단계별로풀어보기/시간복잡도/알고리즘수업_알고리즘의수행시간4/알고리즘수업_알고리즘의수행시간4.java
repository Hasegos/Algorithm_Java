package Baekjun.단계별로풀어보기.시간복잡도.알고리즘수업_알고리즘의수행시간4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수업_알고리즘의수행시간4 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long b = 0;
        for(int i = 1; i < n; i++){
            b += i;
        }
        System.out.println(b + "\n" + "2");
    }
}