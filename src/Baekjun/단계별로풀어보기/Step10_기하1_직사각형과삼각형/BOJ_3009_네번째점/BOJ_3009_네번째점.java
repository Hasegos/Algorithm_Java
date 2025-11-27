package Baekjun.단계별로풀어보기.Step10_기하1_직사각형과삼각형.BOJ_3009_네번째점;

import java.util.Scanner;

public class BOJ_3009_네번째점 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        int[] arr = new int[7];

        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }

        if(arr[0] == arr[2]){
            x = arr[4];
        }
        else if(arr[2] == arr[4]){
            x = arr[0];
        }
        else {
            x = arr[2];
        }

        if(arr[1] == arr[3]){
           y = arr[5];
        }
        else if(arr[1] == arr[5]){
            y = arr[3];
        }
        else {
            y= arr[1];
        }
        System.out.println(x + " " + y);
    }
}