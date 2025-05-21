package Solved.Class.Class2.Silver.좌표정렬하기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 좌표정렬하기2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // x
            arr[i][1] = Integer.parseInt(st.nextToken());  // y
        }
        //Comparator(arr,N);
        lambdaComparator(arr);
    }
    // Comparator 방식
    public static void Comparator(int[][] arr, int N){
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1,int[] s2) {
                if(s1[1] > s2[1]){
                    return 1;
                }
                else if(s1[1] < s2[1]){
                    return -1;
                }
                else{
                    if(s1[0] > s2[0]){
                        return 1;
                    }
                    else if(s1[0] < s2[0]){
                        return -1;
                    }
                    else {
                        return 0;
                    }
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
    
    // Lambda 형식
    public static void lambdaComparator(int[][] arr){
        Arrays.sort(arr, (s1, s2) -> {
            if(s1[1] == s2[1]) {
                return s1[0] - s2[0];
            } else {
                return s1[1] - s2[1];
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}