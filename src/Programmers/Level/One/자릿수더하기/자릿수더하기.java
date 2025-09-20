package Programmers.Level.One.자릿수더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 자릿수더하기 {

    public static void main(String[] args) throws IOException {

        Solution solution = new Solution();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        solution.solution(n);
    }
}

class Solution {
    public int solution(int n){
        int answer = 0;
        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}