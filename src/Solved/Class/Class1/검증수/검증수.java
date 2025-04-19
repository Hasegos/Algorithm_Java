package Solved.Class.Class1.검증수;

import java.util.Scanner;

public class 검증수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, result = 0;
        for(int i = 0; i < 5; i++){
            N = sc.nextInt();
            result += N * N;
        }
        System.out.println(result % 10);
    }
}