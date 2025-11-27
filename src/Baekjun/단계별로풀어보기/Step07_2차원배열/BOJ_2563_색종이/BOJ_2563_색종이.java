package Baekjun.단계별로풀어보기.Step07_2차원배열.BOJ_2563_색종이;

import java.util.Scanner;

public class BOJ_2563_색종이 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;
        sc.nextLine();
        int[][] arr = new int[100][100];

        // 입력받은 공간은 1로 색칠
        for(int i = 0; i < num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();

            for(int j = x; j < x + 10; j++){
                for(int k = y; k < y + 10; k++){
                    arr[j][k] = 1;
                }
            }
        }
        // 색칠된 공간을 모두 더하면됨 (굳이 겹치는거 뺄 이유 x)
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(arr[i][j] == 1){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
