package Stage8.진법변환;

import java.util.Scanner;

public class 진법변환 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr = sc.next(); // 문자열
        int base = sc.nextInt(); // 진수
        int result = 0; // 결과

        sc.nextLine();

        sc.close();
        int j = 0;
        for(int i = arr.length() - 1; i >= 0 ; i--){

            if( arr.charAt(i) >= 65){
                result += (int) ((arr.charAt(i) - 'A' + 10) * Math.pow(base,j));
            }
            else{
                result += (int) ((arr.charAt(i) - '0') * Math.pow(base,j));
            }
            j++;
        }
        System.out.println(result);
    }

    public int pow(int base , int j){
        int num = 1;
        for(int i = 0; i < j; i++){
            num *= base;
        }
        return num;
    }
}