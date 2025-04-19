package Solved.Class.Class1.A더하기B빼기C;

import java.util.Scanner;

public class A더하기B빼기C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String a = A + "" + B;

        System.out.println((A + B) - C);
        System.out.println(Integer.parseInt(a) - C);
    }
}