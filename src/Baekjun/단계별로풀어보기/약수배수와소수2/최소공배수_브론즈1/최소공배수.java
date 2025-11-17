package Baekjun.단계별로풀어보기.약수배수와소수2.최소공배수_브론즈1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최소공배수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine()), gcd = 1;
        for(int i = 0; i < T; i++){
            String[] s = bf.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            for(int j = 2;  j <= Math.max(a,b); j++){
                if(a % j == 0 && b % j == 0){
                    gcd = j;
                }
            }
            sb.append(((a * b) / gcd) + "\n");
            gcd = 1;
        }
        System.out.println(sb);
    }
}