package Baekjun.단계별로풀어보기.집합과맵.문자열집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 문자열집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < arr[0]; i++){
            map.put(bf.readLine(), 1);
        }

        for(int i = 0; i < arr[1]; i++){
            String s = bf.readLine();
            if(map.containsKey(s)){
                answer += map.get(s);
            }
        }
        System.out.println(answer);
    }
}