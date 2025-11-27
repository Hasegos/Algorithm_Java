package Baekjun.단계별로풀어보기.Step05_문자열.BOJ_1152_단어의개수;

import java.util.Scanner;

public class BOJ_1152_단어의개수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        if(s.charAt(0) == ' '){
            count--;
        }
        if(s.charAt(s.length() - 1) == ' '){
            count--;
        }
        System.out.println(count);
    }
}