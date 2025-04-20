package Solved.Class.Class1.OX퀴즈;

import java.util.Scanner;

public class OX퀴즈 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr;
        int T = sc.nextInt();
        int result = 0, check = 0, num = 0;
        for(int i = 0; i < T; i++){
            arr = sc.next();
            for(int j = 0; j < arr.length(); j++){
                if(arr.charAt(j) == 79){
                    if(check == 1){
                        num ++;
                        result += num;
                    }
                    else{
                        num = 1; // 연속함을 나타냄
                        result ++;
                        check = 1; // 연속하는지 확인용도
                    } 
                }
                else {
                    check = 0;
                }
            }
            System.out.println(result);
            result = 0;
            num = 0;
        }
    }
}