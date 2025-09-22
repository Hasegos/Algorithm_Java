package Programmers.Level.One.자릿수더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 자릿수더하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        solution(n);
    }

    public static int solution(int n){
        int answer = 0;
        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}