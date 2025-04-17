package Stage9.배수와약수;

import java.util.Scanner;

public class 배수와약수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B = 0;

        while (true){
            A = sc.nextInt();
            B = sc.nextInt();

            if(A == 0 && B == 0){
                break;
            }
            if(B % A == 0){
                System.out.println("factor");
            }
            else if(A % B == 0){
                System.out.println("multiple");
            }
            else{
                System.out.println("neither");
            }
            sc.nextLine();
        }
    }
}