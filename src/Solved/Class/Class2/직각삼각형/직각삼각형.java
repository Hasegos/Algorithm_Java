package Solved.Class.Class2.직각삼각형;

import java.util.Scanner;

public class 직각삼각형 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int max = -1, result = 0;

        while (true){
            for(int i = 0; i < 3; i ++){
                arr[i] = sc.nextInt();
            }
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                break;
            }
            for(int i = 0; i < 3; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            for(int i = 0; i < 3; i ++){
                result += (arr[i] * arr[i]);
            }
            if((max * max) == (result - (max * max))){
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
            result = 0;
            max = -1;
        }
    }
}