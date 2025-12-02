package Baekjun.단계별로풀어보기.Step17_조합론.녹색거탑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 녹색거탑 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int answer = (int) Math.pow(2,N);
        System.out.println(answer);
    }
}