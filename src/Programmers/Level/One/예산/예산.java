package Programmers.Level.One.예산;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        solution(new int[]{1,3,2,5,4}, 9);
    }
    public static int solution(int[] d, int budget){
        int answer = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            if(budget - d[i] < 0){
                break;
            }
            budget -= d[i];
            answer ++;
        }
        return answer;
    }
}