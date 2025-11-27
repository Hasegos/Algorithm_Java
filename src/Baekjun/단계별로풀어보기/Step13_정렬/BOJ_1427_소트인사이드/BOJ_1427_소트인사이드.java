package Baekjun.단계별로풀어보기.Step13_정렬.BOJ_1427_소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1427_소트인사이드 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        Arrays.sort(arr);

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}