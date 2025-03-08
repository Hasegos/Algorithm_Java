package Stage6.킹퀸룩비숍나이트폰;

import java.util.Scanner;

public class 킹퀸룩비숍나이트폰 {

    public static void main(String[] args) {
        int[] arr = new int[6];
        // 킹, 퀸, 룩, 비숍, 나이트, 폰 순서대로 배열값 만듦
        int[] arr_2 = {1,1,2,2,2,8};

        Scanner sc = new Scanner(System.in);
        for(int i=0; i < 6; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i < 6; i++){
            System.out.print(arr_2[i] - arr[i]);
            System.out.print(" ");
        }
    }
}
