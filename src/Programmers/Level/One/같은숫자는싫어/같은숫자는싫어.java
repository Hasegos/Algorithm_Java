package Programmers.Level.One.같은숫자는싫어;

import java.util.stream.IntStream;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        solution(new int[]{1,1,3,3,0,1,1});
    }
    public static int[] solution(int []arr){
        int[] answer = IntStream.range(0, arr.length)
                .filter(i -> i == 0 || arr[i] != arr[i-1])
                .map(i -> arr[i])
                .toArray();
        return answer;
    }
}