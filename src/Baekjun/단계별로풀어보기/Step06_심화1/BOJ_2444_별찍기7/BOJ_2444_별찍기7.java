package Stage6.별찍기7;

import java.util.Scanner;

public class BOJ_2444_별찍기7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // 별 위쪽 찍기
        for(int i = 0; i < N; i++){
            for(int j = N - 1; j > i; j--){
                System.out.print(' ');
            }
            for(int k = 0; k < i * 2 + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 반대쪽 찍기
        for(int i = N-1; i > 0; i--){
            for(int j = i; j < N; j++){
                System.out.print(' ');
            }
            for(int k = 0; k < i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
