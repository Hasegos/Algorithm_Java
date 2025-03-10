package Stage7.행렬덧셈;

import java.util.Scanner;

public class 행렬덧셈 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,M;
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        int [][] A = new int[N][M];
        int [][] B = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                A[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                B[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        sc.close();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(A[i][j] + B[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
