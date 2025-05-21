package Solved.Class.Class2.Silver.수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr_N = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            arr_N[i] = Integer.parseInt(st.nextToken());
        }
        // 반드시 정렬
        Arrays.sort(arr_N);

        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < M; i++){
            if(find(arr_N,Integer.parseInt(st.nextToken())) > 0){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    // 이분 탐색 법 -> 최악의 시간 : O(log(n))
    public static int find(int[] arr_N, int num){

        int left = 0; // 왼쪽
        int right = arr_N.length - 1; // 오른쪽

        while (left <= right){
            int mid = (left + right) / 2;

            if(num < arr_N[mid]){
                right = mid - 1;
            }
            else if(num > arr_N[mid]){
                left = mid + 1;
            }
            // 중간에 딱 존재
            else{
                return 1;
            }
        }
        return 0;
    }
    
    // 이중 반복문으로 찾기 -> 최악의 시간 : O(n^2)
    public static void forSearch(int[] arr_N, int[] arr_M){
        int count = 0;
        for(int i = 0; i < arr_M.length; i++){
            for(int j = 0; j < arr_N.length; j++){
                if(arr_N[j] == arr_M[i]){
                    System.out.println(1);
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(0);
            }
            count = 0;
        }
    }
}