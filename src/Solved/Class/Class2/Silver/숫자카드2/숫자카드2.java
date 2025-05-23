package Solved.Class.Class2.Silver.숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 정렬
        int M = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < M; i++){
            int a = Integer.parseInt(st.nextToken());
            sb.append(upSearch(arr,a) - underSearch(arr,a)).append(" ");
        }
        System.out.println(sb);
    }

    public static int underSearch(int[]arr, int N){
        int left = 0;
        int right = arr.length;

        while (left < right){
            int mid = (left + right) / 2;

            // 같을 때까지 쭉 찾음 그이후에 가장 왼쪽에있는 걸 반환
            if(arr[mid] >= N){
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static int upSearch(int[] arr, int N){
        int left = 0;
        int right = arr.length;

        while (left < right){
            int mid = (left + right) / 2;

            // N 값보다 딱 하나 더큰 수를 찾음
            if(N < arr[mid]){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return right;
    }
}