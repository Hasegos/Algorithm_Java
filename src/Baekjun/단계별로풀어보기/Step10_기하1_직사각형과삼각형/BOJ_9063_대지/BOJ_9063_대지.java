package Baekjun.단계별로풀어보기.Step10_기하1_직사각형과삼각형.BOJ_9063_대지;

import java.util.Scanner;

public class BOJ_9063_대지 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), max_X = -10000, max_Y = -10000;
        int min_X = 10000, min_Y = 10000;
        int[] arr = new int[N * 2 + 1];
        for(int i = 0; i < N * 2; i++){
            arr[i] = sc.nextInt();
        }
        // X값의 최대, 최소
        for(int j = 0; j < N * 2; j+=2) {
            if(max_X < arr[j]){
                max_X = arr[j];
            }
            if(min_X > arr[j]){
                min_X = arr[j];
            }
        }
        //  Y값의 최대 , 최소  
        for(int j = 1; j < N * 2; j+=2) {
            if(max_Y < arr[j]){
                max_Y = arr[j];
            }
            if(min_Y > arr[j]){
                min_Y = arr[j];
            }
        }
        // 한점만 있을경우
        if(max_X == min_X || max_Y == min_Y){
            System.out.println(0);
        }
        else if(min_Y < 0 || min_X < 0){
            if(min_Y < 0){
                System.out.println(((min_Y * -1) +  max_Y ) *  (max_X - min_X));
            }
            else {
                System.out.println(((min_X * -1) +  max_X ) *  (max_Y - min_Y));
            }
        }
        else {
            System.out.println((max_X - min_X )* (max_Y - min_Y));
        }
    }
}