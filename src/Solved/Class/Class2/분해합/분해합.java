package Solved.Class.Class2.분해합;

import java.util.Scanner;

public class 분해합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i < num; i++){
            int j = i;
            int sum = i;
            while (j != 0){
                sum += j % 10;
                j = j / 10;
            }
            if(sum == num){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}