package Solved.Class.Class2.Silver.설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        // 4와 7은
        if(N == 4 || N == 7){
            System.out.println(-1);
        }
        // 5로 나눠떨어질 경우
        else if(N % 5 == 0){
            System.out.println(N / 5);
        }
        // 5로 나눈 나머지에서 1과 3일 경우 (6 -> 3 x 2 혹은 8 -> 3 + 5)
        else if((N % 5) == 1 || (N % 5) == 3){
            System.out.println((N / 5) + 1);
        }
        // 5로 나눈 나머지에서 2와 4일 경우 (12 -> 3 x 4 혹은 9 -> 3 x 3)
        else if((N % 5) == 2 || (N % 5) == 4){
            System.out.println((N/5) + 2);
        }
    }
}