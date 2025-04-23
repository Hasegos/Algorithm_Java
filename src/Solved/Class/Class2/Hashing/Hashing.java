package Solved.Class.Class2.Hashing;

import java.util.Scanner;

public class Hashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long result = 0;
        int L = sc.nextInt(), M = 1234567891;
        String arr = sc.next();

        for(int i = 0; i < L; i++){
            result += ((arr.charAt(i) - 'a' + 1) * pow(i));
        }
        System.out.println(result % M);
    }
    public static long pow(int i){
        long num = 1;
        int M = 1234567891;
        for(int j = 0; j < i; j++){
            num = (num * 31) % M;
        }
        return num;
    }
}