package Stage9.약수구하기;

import java.util.Scanner;

public class BOJ_2501_약수구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(),B = sc.nextInt(),num = 0,result = 0;

        for(int i = 1; i <= A; i++){
            if(A % i == 0){
                ++num;
                if(num == B){
                    result = i;
                    break;
                }
            }
        }
        if(num < B){
            System.out.println(0);
        }
        else{
            System.out.println(result);
        }
    }
}
