package Solved.Level.Silver5.막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 막대기 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bf.readLine());

        // max : 막대기 총길이 , temp : 가장 짧은 막대기 길이
        int count = 1, max = 64,temp = 64;
        while (true){
            if(X == max){
                break;
            }
            // 반으로 자르고 빼기  
            temp /= 2;
            max -= temp;
            // 만약 반으로 잘랐을때 X 값보다 작다면 버리지말고 다시 사용
            if(max < X){
                count++;
                max += temp;
            }
        }
        System.out.println(count);
    }
}