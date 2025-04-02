package Stage8.세탁소사장동혁;

import java.util.Scanner;

public class 세탁소사장동혁 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int temp = sc.nextInt();

        for (int i = 0; i < temp; i++) {

            int num = sc.nextInt();

            System.out.print(num / 25);
            System.out.print(" ");
            System.out.print(((num % 25) / 10));
            System.out.print(" ");
            System.out.print(((num % 25) % 10) / 5);
            System.out.print(" ");
            System.out.println(((num % 25) % 10) % 5);
        }
    }
}