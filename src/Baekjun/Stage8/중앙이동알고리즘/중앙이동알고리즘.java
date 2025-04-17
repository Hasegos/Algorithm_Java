package Stage8.중앙이동알고리즘;

import java.util.Scanner;

public class 중앙이동알고리즘 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factor = 2, result = 0;

        for(int i = 0; i < num; i++){
            factor += (int) Math.pow(2, i);
        }
        result = (int) Math.pow(factor, 2);

        System.out.println(result);
    }
}
