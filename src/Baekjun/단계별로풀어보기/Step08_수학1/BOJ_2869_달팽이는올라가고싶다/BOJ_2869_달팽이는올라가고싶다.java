package Stage8.달팽이는올라가고싶다;

import java.util.Scanner;

public class BOJ_2869_달팽이는올라가고싶다 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        sc.nextLine();

        if((V - B) % (A - B) == 0){
            System.out.println((V - B )/ (A - B));
        }
        else {
            System.out.println((V - B) / (A - B) + 1);
        }
    }
}