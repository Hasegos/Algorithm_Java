package Baekjun.단계별로풀어보기.Step05_문자열.BOJ_2908_상수;

import java.util.Scanner;

public class BOJ_2908_상수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int vsA = 0,vsB = 0;
        //  각 자리 수를 구해서 반대로 돌려서 더해주면 끝!
        vsA = ((a % 10) * 100) + (((a / 10) % 10) * 10)+ (a / 100);
        vsB = ((b % 10) * 100) + (((b / 10) % 10) * 10)+ (b / 100);

        if(vsA > vsB){
            System.out.println(vsA);
        }
        else{
            System.out.println(vsB);
        }
    }
}