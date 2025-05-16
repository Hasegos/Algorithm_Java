package Solved.Class.Class2.이항계수1;

import java.util.Scanner;

public class 이항계수1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() , k = sc.nextInt();
        int molecule = 1, division = 1;

        for(int i = k; i > 0; i--){
            molecule *= N;
            division *= i;
            N--;
        }
        System.out.println(molecule / division);
    }
}