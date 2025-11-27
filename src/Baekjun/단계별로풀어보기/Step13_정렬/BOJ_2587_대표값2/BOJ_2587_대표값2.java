package Baekjun.단계별로풀어보기.Step13_정렬.BOJ_2587_대표값2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2587_대표값2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        int mid = arr[2];

        System.out.println(sum / arr.length);
        System.out.println(mid);
    }
}