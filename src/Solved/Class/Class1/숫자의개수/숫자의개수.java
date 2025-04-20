package Solved.Class.Class1.숫자의개수;

import java.util.Scanner;

public class 숫자의개수 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
        String result = String.valueOf(A * B * C);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i ++){
            arr[i] = 0;
        }
        for(int i =0 ; i < result.length(); i++){
            for(int j = 0; j < 10; j++){
                if(result.charAt(i) == (j + 48)){
                    arr[j]++;
                }
            }
        }
        for(int i = 0; i < 10; i ++){
            System.out.println(arr[i]);
        }
    }
}