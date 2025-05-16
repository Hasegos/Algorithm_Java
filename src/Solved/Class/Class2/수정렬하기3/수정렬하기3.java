package Solved.Class.Class2.수정렬하기3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[10001];
        for(int i = 0; i < N; i++){
            arr[Integer.parseInt(bf.readLine())]++;
        }
        bf.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10001; i++){
            while (arr[i] > 0){
                sb.append(i).append("\n");
                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}