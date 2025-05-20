package Solved.Class.Class2.Bronze.부녀회장이될테야;

import java.util.Scanner;

public class 부녀회장이될테야 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] arr= new int[15][15];

        // 미리 층 작성
        for(int i = 0; i < 15; i++){
            arr[0][i] = i;
            arr[i][1] = 1;
        }

        // 1호와 1층을 제외한 나머지 층들 작성
        for(int j = 1; j < 15; j++){
            for(int k = 2; k < 15; k++){
                arr[j][k] = arr[j][k - 1] + arr[j - 1][k];
            }
        }
        // 원하는 층 출력
        for(int i = 0; i < T; i++){
            int k = sc.nextInt() , n = sc.nextInt();
            System.out.println(arr[k][n]);
        }
    }
}