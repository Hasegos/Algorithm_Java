package Solved.Class.Class1.음계;

import java.util.Scanner;

public class 음계 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = 0;
        int[] arr = new int[8];
        for(int i = 0; i < 8; i++){
            arr[i] = sc.nextInt();
        }
        // 1 ~ 8 까지 순서대로인가
        for(int j = 0; j < 8; j++){
            if(arr[j] == j + 1){
                check ++;
            }
        }
        if(check == 8){
            System.out.println("ascending");
            return;
        }
        // 8 ~ 1 까지 순서대로인가
        int i = 0;
        check = 0;
        for(int j = 8; j > 0; j--){
            if(arr[i] == j){
                check ++;
                i++;
            }
        }
        if(check == 8){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
    }
}