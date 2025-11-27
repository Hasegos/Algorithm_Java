package Baekjun.단계별로풀어보기.Step05_문자열.BOJ_5622_다이얼;

import java.util.Scanner;

public class BOJ_5622_다이얼 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            // 특정 구간 3개를 넘어가는 거 때문에 몫이 넘어가는거 조건
            if(s.charAt(i) == 'S'){
                count += 8;
                continue;
            }
            if(s.charAt(i) == 'V'){
                count += 9;
                continue;
            }
            if(s.charAt(i) == 'Z' || s.charAt(i) == 'Y'){
                count += 10;
                continue;
            }
           int a =  s.charAt(i) - 65;
           count += (a / 3) + 3;
        }
        System.out.println(count);
    }
}