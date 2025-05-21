package Solved.Class.Class2.Silver.좌표정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 좌표정렬하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++){
            String[] split = bf.readLine().split(" ");
            arr[i][0] = split[0]; // x
            arr[i][1] = split[1]; // y
        }
        arraySort(arr,N);
    }

    // Comparator
    public static void arraySort(String[][] arr, int N){

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                int s1_x = Integer.parseInt(s1[0]); // s1_x
                int s2_x = Integer.parseInt(s2[0]);  // s2_x

                int s1_y = Integer.parseInt(s1[1]); // s1_y
                int s2_y = Integer.parseInt(s2[1]);  // s2_y

                if(s1_x > s2_x){
                    return 1;
                }
                else if(s1_x < s2_x){
                    return -1;
                }
                else{
                    if(s1_y > s2_y){
                        return 1;
                    }
                    else if(s1_y < s2_y) {
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
}