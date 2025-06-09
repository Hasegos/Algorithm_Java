package Solved.Class.Class3.Silver.이xn타일링;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이xN타일링 {

    static int[] arr;
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        /* ––––– 1, 2 는 기본생성 ––––– */
        arr = new int[N + 2];
        System.out.println(add(N));
    }

    public static int add(int N){
        arr[1] = 1;
        arr[2] = 2;
        /* ––––– 3부터는 그전 경우의수를 더하고 10007로 나눈 나머지 ––––– */
        for(int i = 3; i<=N; i++){
            arr[i] = (arr[i - 2] + arr[i - 1]) % 10007;
        }
        return arr[N];
    }
}