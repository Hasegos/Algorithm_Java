package Baekjun.Stage10.삼각형외우기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼각형외우기 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[3];
        int sum = 0;
        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
        }

        /* ––––– 각 조건에 맞게 설정 ––––– */
        if(sum != 180){
            System.out.println("Error");
        }
        else if(arr[0] == arr[1] && arr[1] == arr[2]){
            System.out.println("Equilateral");
        }
        else if(arr[0] == arr[1] || arr[1] == arr[2]  || arr[2] == arr[0]){
            System.out.println("Isosceles");
        }
        else{
            System.out.println("Scalene");
        }
    }
}