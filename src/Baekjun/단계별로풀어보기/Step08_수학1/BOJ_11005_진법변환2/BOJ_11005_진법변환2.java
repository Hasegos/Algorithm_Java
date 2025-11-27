package Stage8.진법변환2;

import java.util.Scanner;

public class BOJ_11005_진법변환2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int share = 1;
        int remain = 0;

        StringBuilder result = new StringBuilder(); // 객체생성
        while (share > 0){
            share = N / B;
            remain = N % B;
            N = share;

            if(remain >= 10){
                result.append((char)(remain + 55));
            }
            else{
                result.append(remain);
            }
        }
        for(int i = result.length() - 1; i >=0; i--){
            System.out.print(result.charAt(i));
        }
    }
}