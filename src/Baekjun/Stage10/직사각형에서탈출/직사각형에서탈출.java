package Baekjun.Stage10.직사각형에서탈출;

import java.util.Scanner;

public class 직사각형에서탈출 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int A = w - x, B = h - y , C = x, D = y;

        if(A <= B && A <= C && A <= D){
            System.out.println(A);
        }
        else if(B <= A && B <= C && B <= D){
            System.out.println(B);
        }
        else if(C <= A && C <= D && C <= B){
            System.out.println(C);
        }
        else if(D <= A && D <= B && D <= C){
            System.out.println(D);
        }
    }
}