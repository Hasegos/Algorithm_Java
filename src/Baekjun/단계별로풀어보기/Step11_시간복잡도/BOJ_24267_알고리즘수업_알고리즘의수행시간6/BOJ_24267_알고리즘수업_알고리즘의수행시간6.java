package Baekjun.단계별로풀어보기.Step11_시간복잡도.BOJ_24267_알고리즘수업_알고리즘의수행시간6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24267_알고리즘수업_알고리즘의수행시간6 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long a = 0, j = 1;
        for(int i = n-2; i > 0; i--){
            a += (long) i *j;
            j++;
        }
        System.out.println(a + "\n" + "3");
    }
}