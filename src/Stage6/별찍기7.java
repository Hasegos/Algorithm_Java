package Stage6;

import java.util.Scanner;

/* 문제 : 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요. */

/* 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.*/

/*출력 : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다. */

/*
예제 입력 1 : 5
예제 출력 1 :
    *
   ***
  *****
 *******
*********
 *******
  *****
  ***
   * */

public class 별찍기7 {

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
