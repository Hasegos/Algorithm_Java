package Baekjun.단계별로풀어보기.Step12_브루트포스.BOJ_19532_수학은비대면강의입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_19532_수학은비대면강의입니다 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = arr[0], b = arr[1], c = arr[2];
        int d = arr[3], e = arr[4], f = arr[5];

        // 유일하게 존재함으로 사용가능
        for(int x = -999; x <= 999; x++){
            for(int y = -999; y <= 999; y++){
                if(a * x + b * y == c && d * x + e * y == f){
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }
}