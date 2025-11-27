package Stage9.소수;

import java.util.Scanner;

public class BOJ_2581_소수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int num = 0,result = 0, min = 10000;

        for(int i = M; i <= N; i++){
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    num += j;
                }
            }
            if(num == 1){
                if(min > i){
                    min = i;
                }
                result += i;
            }
            num = 0;
        }
        if(result == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(result);
            System.out.println(min);
        }
    }
}