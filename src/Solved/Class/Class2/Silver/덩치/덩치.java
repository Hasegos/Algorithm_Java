package Solved.Class.Class2.Silver.덩치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 덩치 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            String[] split = bf.readLine().split(" ");
            arr[i][0] = Integer.parseInt(split[0]);
            arr[i][1] = Integer.parseInt(split[1]);
        }
        sort(arr,N);
    }
    // 브루트포스 알고리즘
    public static void sort(int[][] arr,int N){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            int rank = 1; // 랭킹

            for(int j = 0; j < N; j++){
                if(i == j) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}