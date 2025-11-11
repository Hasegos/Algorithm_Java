package Baekjun.단계별로풀어보기.집합과맵.대칭차집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 대칭차집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        String[] s = bf.readLine().split(" ");
        String[] s2 = bf.readLine().split(" ");
        int resultA = 0, resultB = 0;

        for(int i = 0; i <s.length; i++){
            int num = Integer.parseInt(s[i]);
            map.put(num, num);
        }
        for(int i = 0; i <s2.length; i++){
            int num = Integer.parseInt(s2[i]);
            map2.put(num, num);
        }
        for(int i = 0; i < s2.length; i++){
            if(map.containsKey(Integer.parseInt(s2[i]))){
                resultA++;
            }
        }
        for(int i = 0; i < s.length; i++){
            if(map2.containsKey(Integer.parseInt(s[i]))){
                resultB++;
            }
        }
        System.out.println((map.size() - resultA) + (map2.size() - resultB));
    }
}