package Baekjun.단계별로풀어보기.정렬.커트라인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 커트라인 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0], k = arr[1];
        int[] score = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(score);
        System.out.println(score[n - k]);
    }
}