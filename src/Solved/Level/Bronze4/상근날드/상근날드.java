package Solved.Level.Bronze4.상근날드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 상근날드 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] burger = new int[3];
        int[] drink = new int[2];

        for(int i = 0; i < 3; i++){
            burger[i] = Integer.parseInt(bf.readLine());
        }
        for(int i = 0; i < 2; i++){
            drink[i] = Integer.parseInt(bf.readLine());
        }
        /* ––––– 입력받은값 정렬 ––––– */
        Arrays.sort(burger);
        Arrays.sort(drink);

        /* ––––– 가장 작은값들 더하고 - 50 하기 ––––– */
        System.out.println(burger[0] + drink[0] - 50);
    }
}