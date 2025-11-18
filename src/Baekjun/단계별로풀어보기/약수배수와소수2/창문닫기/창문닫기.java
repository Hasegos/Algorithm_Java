package Baekjun.단계별로풀어보기.약수배수와소수2.창문닫기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 창문닫기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(bf.readLine());
        int count = 1;
        long i = 1;
        while (i * i <= n){
            double pow = Math.pow(i, 2);
            if(pow <= n){
                count++;
            }
            i++;
        }
        System.out.println(count - 1);
    }
}