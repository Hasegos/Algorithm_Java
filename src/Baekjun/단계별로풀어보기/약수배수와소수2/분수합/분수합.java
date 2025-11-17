package Baekjun.단계별로풀어보기.약수배수와소수2.분수합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수합 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] x = new int[2];
        int[] y = new int[2];
        for(int  i = 0; i < 2; i++){
            String[] s = bf.readLine().split(" ");
            x[i] = Integer.parseInt(s[0]);
            y[i] = Integer.parseInt(s[1]);
        }

        int a = y[1] * x[0] + y[0] * x[1];
        int b = y[0] * y[1];
        int temp_a = a, temp_b = b;

        while (b > 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gdc = a;
        sb.append( (temp_a / gdc) + " " + (temp_b / gdc));
        System.out.println(sb);
    }
}