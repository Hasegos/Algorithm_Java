package Programmers.Level.One.짝수와홀수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 짝수와홀수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        solution(n);
    }

    public static String solution(int num){
        String answer = "";
        if(num % 2 == 0){
            answer = "Even";
        }
        else {
            answer = "Odd";
        }
        return answer;
    }
}