package Baekjun.단계별로풀어보기.집합과맵.서로다른부분문자열의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 서로다른부분문자열의개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                set.add(s.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}