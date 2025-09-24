package Programmers.Level.One.제일작은수제거하기;

import java.util.Arrays;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        solution(new int[]{10});
    }
    public static int[] solution(int[] arr){
        int[] answer = {};
        if(arr.length <= 1){
            answer = new int[]{-1};
            return answer;
        }
        // 가장 작은 수 구하기
        int min = Arrays.stream(arr).min().getAsInt(); 
        answer = Arrays.stream(arr).filter(a -> a != min).toArray();
        return answer;
    }
}