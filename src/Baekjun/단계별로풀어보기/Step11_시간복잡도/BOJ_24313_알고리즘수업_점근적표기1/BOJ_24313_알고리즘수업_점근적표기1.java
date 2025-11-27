package Baekjun.단계별로풀어보기.Step11_시간복잡도.BOJ_24313_알고리즘수업_점근적표기1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_24313_알고리즘수업_점근적표기1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int c = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());

        for(int i = n; i <= 100; i++ ){
            int fx = a[0] * i + a[1];
            if(fx > i * c){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}