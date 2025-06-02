package Solved.Class.Class3.Silver.숫자1로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자1로만들기 {

    static int[] arr;
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bf.readLine());
        arr = new int[1000004];
        System.out.println(numberOne(X));
    }

    /* ––––– 숫자 1이되는 최소값  ––––– */
    public static int numberOne(int X){
        arr[1] = 0;
        /* ––––– Bottom to Top ––––– */
        for(int i = 2; i <= X; i++){
            arr[i] = arr[i - 1] + 1;
            if(i % 2 == 0){
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            }
            if(i % 3 == 0){
                arr[i] = Math.min(arr[i], arr[i / 3] + 1);
            }
            System.out.println(arr[i]);
        }
        return arr[X];
    }
}