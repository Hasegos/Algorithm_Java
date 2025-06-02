package Solved.Level.Bronze3.별찍기17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기17 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N - 1 - i; j++){
                System.out.print(" ");
            }
            /* ––––– 첫째줄은 무조건 하나 출력 ––––– */
            if(i == 0){
                System.out.print("*");
            }
            /* ––––– 마지막줄이면 i * 2 + 1 개 출력––––– */
            else if(i == N - 1){
                for(int k = 0; k < i * 2 + 1; k++){
                    System.out.print("*");
                }
            }
            /* ––––– 2보다 크고 2 ~ 마지막줄 전이라면 가운데는 빈칸 ––––– */
            else if(N > 2 && i >= 1){
                System.out.print("*");
                for(int k = 0; k < (i - 1) * 2 + 1; k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}