package Baekjun.단계별로풀어보기.Step15_약수배수와소수2.BOJ_13241_최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13241_최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = bf.readLine().split(" ");
        Long a = Long.parseLong(s[0]);
        Long b = Long.parseLong(s[1]);

        Long gcd = 1L;
        for(Long i = 2L; i <= Math.max(a,b); i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        sb.append((a * b) / gcd);
        System.out.println(sb);
    }
}