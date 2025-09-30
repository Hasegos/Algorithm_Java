package Programmers.Level.One.최소직사각형;

import java.util.Arrays;

public class 최소직사각형 {
    public static void main(String[] args) {
        solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}});
    }

    public static int solution(int[][] sizes){
        int answer = 0;
        int max_x = 0, max_y = 0;

        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
        }

        for(int i = 0; i < sizes.length; i++){
            if(max_x < sizes[i][0]){
                max_x = sizes[i][0];
            }
            if(max_y < sizes[i][1]){
                max_y = sizes[i][1];
            }
        }
        answer = max_x * max_y;
        return answer;
    }
}