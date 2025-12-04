package Baekjun.단계별로풀어보기.Step18_심화2.BOJ_26069_붙임성좋은총총이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_26069_붙임성좋은총총이 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            String[] s = bf.readLine().split(" ");

            if(set.contains(s[0]) || set.contains(s[1])){
                set.add(s[0]);
                set.add(s[1]);
            }
        }
        sb.append(set.size());
        System.out.println(sb);
    }
}