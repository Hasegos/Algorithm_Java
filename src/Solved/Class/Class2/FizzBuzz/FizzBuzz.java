package Solved.Class.Class2.FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        int k = 0;
        for(int i =0; i < 3; i++){
            arr[i] = sc.next();
            if(arr[i].matches("[+-]?\\d*(\\.\\d+)?")) {
                k = Integer.parseInt(arr[i]);
                if (i == 0) {
                    k += 3;
                } else if (i == 1) {
                    k += 2;
                } else {
                    k += 1;
                }
            }
        }
        if(k % 3 == 0 && k % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(k % 3 == 0 && k % 5 != 0){
            System.out.println("Fizz");
        }
        else if(k % 3 != 0 && k % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(k);
        }
    }
}