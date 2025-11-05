package Baekjun.단계별로풀어보기.기하1직사각형과삼각형.세막대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 세막대 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0, max = Arrays.stream(arr).max().getAsInt();

        for (int j : arr) {
            sum += j;
        }
        int twoSide = (sum - max);

        if(twoSide <= max){
            System.out.println(twoSide + (max - (max - twoSide)) - 1);
        }else {
            System.out.println(sum);
        }
    }
}