package Solved.Level.Bronze3.별찍기8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기8 {
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        /* 위에 부분 */
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 0; k < (N - i - 1); k++){
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /* 밑에 부분 */
        for(int i = 0; i < N-1; i++){
            for(int k = N - 1; k > i; k--){
                System.out.print("*");
            }
            for(int j = N; j > (N - i - 1) ; j--){
                System.out.print("  ");
            }
            for(int k = N - 1; k > i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}