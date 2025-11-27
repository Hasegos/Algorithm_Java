package Baekjun.단계별로풀어보기.Step15_약수배수와소수2.BOJ_2485_가로수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2485_가로수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());
        int[] arr = new int[T];
        int[] arr_2  = new int[arr.length - 1];
        for(int i = 0; i < T; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        for(int i = 0; i < arr.length - 1; i++){
            arr_2[i] = Math.max(arr[i], arr[i+1]) - Math.min(arr[i], arr[i+1]);
        }
        int gdc = arr_2[0];
        for(int i = 0; i < arr_2.length - 1; i++){
            gdc = gdc(gdc, arr_2[i+1]);
        }

        int result = 0;
        for(int i = 0; i < arr_2.length; i++){
            if(arr_2[i] / gdc == 0){
                continue;
            }
            result += ((arr_2[i] / gdc) - 1);
        }
        sb.append(result);
        System.out.println(sb);
    }

    public static int gdc(int a, int b){
        while (b > 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}