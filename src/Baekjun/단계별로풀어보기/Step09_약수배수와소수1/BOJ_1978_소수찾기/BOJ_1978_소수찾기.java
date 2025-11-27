package Stage9.소수찾기;

import java.util.Scanner;

public class BOJ_1978_소수찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), num = 0, result = 0;

        for(int i = 0 ; i < N; i++){
            int A = sc.nextInt();

            for(int j = 1; j < A;  j++){
                if(A % j == 0){
                    num += j;
                }
            }
            if(num == 1){
                result++;
            }
            num = 0;
        }
        System.out.println(result);
    }
}