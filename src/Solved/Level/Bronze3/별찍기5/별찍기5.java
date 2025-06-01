package Solved.Level.Bronze3.별찍기5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기5 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        /* ––––– * 찍기 ––––– */
        for(int i = 0; i < N; i++){
            for(int j = 0; j < (N - i - 1);  j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (i * 2 + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}