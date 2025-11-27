package Stage9.약수들의합;

import java.util.Scanner;

public class BOJ_9506_약수들의합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, result = 1;
        String arr = "";
        while (true){
            n = sc.nextInt();
            if(n == -1){
                break;
            }
            arr += n + " = 1";
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    result += i;
                    arr += " + " + i;
                }
            }
            if(result == n){
                System.out.println(arr);
            }
            else{
                System.out.println(n + " is NOT perfect.");
            }
            result = 1;
            arr = "";
        }
    }
}