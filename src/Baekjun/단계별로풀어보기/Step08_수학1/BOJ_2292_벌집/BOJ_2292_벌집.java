package Stage8.벌집;

import java.util.Scanner;

public class BOJ_2292_벌집 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0, temp = 1, i = 1;
        while (true){
            result ++;

            if(temp >= num){
                break;
            }
            temp += 6 * i;
            i++;
        }
        System.out.println(result);
    }
}