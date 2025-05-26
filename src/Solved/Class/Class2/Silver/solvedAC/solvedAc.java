package Solved.Class.Class2.Silver.solvedAC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solvedAc {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = (Integer.parseInt(bf.readLine()));
        }
        solved(N,arr);
    }

    public static void solved(int N, int[] arr) {
        Arrays.sort(arr);
        int avg = (int)Math.round(N * 0.15); // 반올림
        double result = 0;
        
        // avg 에서 (전체 개수 - avg 개수만큼 뺀 것) 만큼 반복
        for(int  i = avg; i < N - avg; i++){
            result += arr[i];
        }
        // 전체 길이에서 평균 값의 두배를 뺏을때 실질적인 길이이다.
        int trimAvg = (int)Math.round(result /  (arr.length - (2 * avg)));
        System.out.println(trimAvg);
    }
}