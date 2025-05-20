package Solved.Class.Class2.Bronze.웰컴키트;

import java.util.Scanner;

public class 웰컴키트 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long t = 0, a, b;
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }
        int T = sc.nextInt(), P = sc.nextInt();

        for(int i = 0; i < 6; i++){
            if(arr[i] == 0){
                continue;
            }
            if(T % arr[i] == 0){
                t += arr[i] / T;
            }
            else{
                t += ((arr[i] / T) + 1);
            }
        }
        a = N / P;
        b = N - (P * a);

        System.out.println(t);
        System.out.println(a + " "  + b);
    }
}