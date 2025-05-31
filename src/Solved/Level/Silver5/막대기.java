package Solved.Level.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 막대기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bf.readLine());

        
        // max : 막대기 총길이 , temp : 가장 짧은 막대기 길이
        int count = 1, max = 64,temp = 64;

        while (true){
            if(X == max){
                break;
            }
            temp /= 2; // 일단 짤라
            max -= temp; // 일단 하나버려
            if(max < X){
                count++;
                max += temp;
            }
        }

        System.out.println(count);
    }
}