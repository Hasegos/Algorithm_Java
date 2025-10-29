package Programmers.Level.One.K번째수;

import java.util.ArrayList;
import java.util.Arrays;

public class K번째수 {

    public static void main(String[] args) {
        solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }

    public static ArrayList<Integer> solution(int[] array, int[][] commands){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];

            int[] temp = new int[end - start + 1];
            int k = 0;
            for(int j = start - 1; j < end; j++){
                temp[k] = array[j];
                k++;
            }
            Arrays.sort(temp);
            answer.add(temp[target - 1]);
        }
        return answer;
    }
}