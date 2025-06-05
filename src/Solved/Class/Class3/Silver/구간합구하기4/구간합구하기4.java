package Solved.Class.Class3.Silver.구간합구하기4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구간합구하기4 {

    /* ––––– 전체 배열 ––––– */
    static int[] arr; 
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        /* ––––– 수의 개수, 합을 구해야하는 횟수––––– */
        int N = Integer.parseInt(s[0]); 
        int M = Integer.parseInt(s[1]);

        String[] a = bf.readLine().split(" ");
        arr = new int[N];

        /* ––––– 배열 0번부터 순차적으로 1~n 번까지 더한걸로 배열을 만들어주면된다. ––––– */
        arr[0] = Integer.parseInt(a[0]);
        for(int i = 1; i < N ; i++){
            arr[i] = Integer.parseInt(a[i]) + arr[i-1];
        }

        for(int j = 0; j < M; j++){
            String[] b = bf.readLine().split(" ");
            int start = Integer.parseInt(b[0]);
            int end = Integer.parseInt(b[1]);

            /* ––––– 만약 1부터 시작이 아닌 값은 1~시작점까지 뺴줘야한다. ––––– */
            /*
            * ex) 2 ~ 4 까지라 하자.
            * 1 ~ 4 까지 더하고 1번째껄 빼주면 2 ~ 4번째의 합산한 값을 구할 수 있다.
            * */
            if(start > 1){
                sb.append(arr[end - 1] - arr[start-2]).append("\n");
            }
            else{
                sb.append(arr[end - 1]).append("\n");
            }
        }
        System.out.println(sb);
    }
}