package Baekjun.단계별로풀어보기.Step19_재귀.BOJ_25501_재귀의귀재;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25501_재귀의귀재 {

    private static int callRecursion = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++){
            String s = bf.readLine();
            sb.append(isPalindrome(s)).append(" ").append(callRecursion).append("\n");
            callRecursion = 0;
        }
        System.out.println(sb);
    }

    public static int isPalindrome(String s){
        return recursion(s,0, s.length() - 1);
    }

    public static int recursion(String s , int l , int r){
        callRecursion ++;
        if(l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1 , r - 1);
    }
}