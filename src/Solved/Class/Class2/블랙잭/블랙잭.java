package Solved.Class.Class2.블랙잭;

import java.util.Scanner;

public class 블랙잭 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() , M = sc.nextInt(), max = 0;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N - 2; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                    int result = arr[i] + arr[j] + arr[k];
                    if(result > max &&  result  <= M){
                        max = result;
                    }
                }
            }
        }
        System.out.println(max);
    }
}