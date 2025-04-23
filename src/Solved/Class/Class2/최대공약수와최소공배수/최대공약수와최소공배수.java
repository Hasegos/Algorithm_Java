package Solved.Class.Class2.최대공약수와최소공배수;

import java.util.Scanner;

public class 최대공약수와최소공배수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(),num = 0, max = 0 ;
        int b = sc.nextInt();

        if(a < b){
            // 최대 공약수
            for(int i = 1; i <= a; i++){
                if(a % i == 0){
                    num = i;
                }
                if(b % num == 0){
                    if(max < num){
                        max = num;
                    }
                }
            }
        }
        else{
            // 최대 공약수
            for(int i = 1; i <= b; i++){
                if(b % i == 0){
                    num = i;
                }
                if(a % num == 0){
                    if(max < num){
                        max = num;
                    }
                }
            }
        }
        if(a == b){
            System.out.println(max);
            System.out.println(a);
        }
        else{
            System.out.println(max);
            System.out.println((a * b) / max);
        }
    }
}