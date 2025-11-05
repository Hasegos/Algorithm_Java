package Baekjun.단계별로풀어보기.기하1직사각형과삼각형.삼각형과세변;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 삼각형과세변 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] arr = bf.readLine().split(" ");
            int[] num = new int[3];
            int sum = 0;

            for(int i = 0; i < 3; i++){
                num[i] = Integer.parseInt(arr[i]);
                sum += num[i];
            }
            int max = Arrays.stream(num).max().getAsInt();

            if(num[0] == 0 && num[1] == 0 && num[2] == 0){
                break;
            }

            if(max >= (sum - max)){
                System.out.println("Invalid");
            }
            else if(num[0] == num[1] && num[1] == num[2]){
                System.out.println("Equilateral");
            }
            else if(num[0] == num[1] || num[1] == num[2] || num[0] == num[2]){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }
        }
    }
}