package Solved.Class.Class2.Bronze.팰린드롬수;

import java.util.Scanner;

public class 팰린드롬수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        while (true){
            num = sc.next();
            sc.nextLine();
            int check = 0, length = num.length() - 1;
            if(num.equals("0")){
                break;
            }
            for(int i = 0; i < num.length() / 2; i++){
                if(num.charAt(i) == num.charAt(length - i)){
                    check += 1 ;
                }
                else {
                    check = 0;
                }
            }
            if(check == num.length() / 2){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}