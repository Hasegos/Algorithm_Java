package Baekjun.Stage5.그대로출력하기;

import java.util.Scanner;

public class 그대로출력하기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){ // EOF 파일의 끝을 구분 Ctrl + D 누르면 종료
            String arr = sc.nextLine();
            System.out.println(arr);
        }
    }
}
