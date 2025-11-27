package Baekjun.단계별로풀어보기.Step14_집합과맵.BOJ_10815_숫자카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_10815_숫자카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s1 = bf.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();

        int m = Integer.parseInt(bf.readLine());
        String[] s2 = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s1.length; i++){
            map.put(s1[i], 1);
        }

        for(int i = 0; i < s2.length; i++) {
            if(map.containsKey(s2[i])){
                sb.append(1);
            }
            else{
                sb.append(0);
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}