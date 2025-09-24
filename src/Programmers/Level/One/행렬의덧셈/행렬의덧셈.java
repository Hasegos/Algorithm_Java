package Programmers.Level.One.행렬의덧셈;

public class 행렬의덧셈 {
    public static void main(String[] args) {
        int[][] arr1_case1 = new int[][] { {1, 2}, {2, 3} };
        int[][] arr2_case1 = new int[][] { {3, 4}, {5, 6} };
        solution(arr1_case1, arr2_case1);
    }
    public static int[][] solution(int[][] arr1, int[][] arr2){
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}