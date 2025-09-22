package Programmers.Level.One.자연수뒤집어배열로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 자연수뒤집어배열로만들기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());
        solution(n);
    }

    public static int[] solution(long n){
        String str_length = String.valueOf(n);
        int length = str_length.length();
        int[] answer = new int[length];
        int i = 0;
        while (n > 0){
            answer[i] = (int)(n % 10);
            n /= 10;
            i++;
        }
        return answer;
    }
}