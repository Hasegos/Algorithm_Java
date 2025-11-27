package Baekjun.단계별로풀어보기.Step05_문자열.BOJ_11718_그대로출력하기;

import java.util.Scanner;

public class BOJ_11718_그대로출력하기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){ // EOF 파일의 끝을 구분 Ctrl + D 누르면 종료
            String arr = sc.nextLine();
            System.out.println(arr);
        }
    }
}
