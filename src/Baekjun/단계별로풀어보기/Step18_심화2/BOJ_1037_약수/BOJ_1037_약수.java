package Baekjun.단계별로풀어보기.Step18_심화2.BOJ_1037_약수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1037_약수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        String[] s = bf.readLine().split(" ");
        int[] arr = new int[s.length];
        for(int i = 0; i < s.length; i++){
           arr[i] = Integer.parseInt(s[i]);
        }
        if(arr.length == 1){
            sb.append(arr[0] * arr[0]);
        }else{
            Arrays.sort(arr);
            sb.append(arr[0] * arr[arr.length - 1]);
        }
        System.out.println(sb);
    }
}