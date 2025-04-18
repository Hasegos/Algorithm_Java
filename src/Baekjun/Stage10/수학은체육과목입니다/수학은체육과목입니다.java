package Baekjun.Stage10.수학은체육과목입니다;

import java.util.Scanner;

public class 수학은체육과목입니다 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt(), result = 0;
        result = 1 +  a - 1 + a + (a * 2);
        if(a == 1){
            System.out.println(4);
        }
        else{
            System.out.println(result);
        }
    }
}