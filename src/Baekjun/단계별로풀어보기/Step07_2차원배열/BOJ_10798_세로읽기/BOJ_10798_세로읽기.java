package Baekjun.단계별로풀어보기.Step07_2차원배열.BOJ_10798_세로읽기;

import java.util.Scanner;

public class BOJ_10798_세로읽기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        int max = -1;
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextLine();
        }

        for(int i = 0; i < 5; i++){
            if(arr[i].length() > max){
                max = arr[i].length();
            }
        }

        for(int i = 0; i < max; i++){
            for(int j = 0; j < 5; j++){
                // null값
                if(arr[j].length() - 1 < i){
                    continue;
                }
                System.out.print(arr[j].charAt(i));
            }
        }
    }
}
