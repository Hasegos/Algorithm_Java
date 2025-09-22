package Programmers.Level.One.평균구하기;

import java.io.IOException;
import java.util.Arrays;

public class 평균구하기 {

    public static void main(String[] args) throws IOException {
        int[] arr = {2, 3, 4};
        solution(arr);
    }

    public static double solution(int[] arr){
        double answer = 0;
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }

    public static double solutionStream(int[] arr){
        // 한줄로 처리
        return Arrays.stream(arr).average().orElse(0);
    }
}