package Baekjun.단계별로풀어보기.집합과맵.회사에있는사람;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 회사에있는사람 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String[] s = bf.readLine().split(" ");
            if(s[1].equals("leave")){
                map.remove(s[0]);
                continue;
            }
            map.put(s[0], s[1]);
        }
        String[] s2 = map.keySet().toArray(new String[0]);
        Arrays.sort(s2);

        for(int i = s2.length - 1; i >= 0; i--){
            System.out.println(s2[i]);
        }
    }
}