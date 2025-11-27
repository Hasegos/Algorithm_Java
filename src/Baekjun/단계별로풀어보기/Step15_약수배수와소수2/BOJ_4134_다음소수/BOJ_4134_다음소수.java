package Baekjun.단계별로풀어보기.Step15_약수배수와소수2.BOJ_4134_다음소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4134_다음소수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++){
            Long n = Long.parseLong(bf.readLine());
            while (!isPrime(n)){
                n++;
            }
            sb.append(n).append("\n");
        }
        System.out.println(sb);

    }
    public static boolean isPrime(Long n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; (long) i * i <= n; i += 2){

            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}