package Baekjun.단계별로풀어보기.Step07_2차원배열.BOJ_2566_최댓값;

import java.util.Scanner;

public class BOJ_2566_최댓값 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int column = 0, row = 0, max = -1;

        for(int i = 0; i < 9; i ++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for(int i = 0; i < 9; i ++){
            for(int j = 0; j < 9; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    column = i + 1;
                    row = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.print(column + " " + row);
    }
}
