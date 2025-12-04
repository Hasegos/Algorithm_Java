package Baekjun.단계별로풀어보기.Step18_심화2.BOJ_25192_인사성밝은곰곰이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class BOJ_25192_인사성밝은곰곰이 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        int count = 0, temp = 0;

        for(int i = 0; i < T; i++){
            list.add(bf.readLine());
        }

        for(int i = 1; i < list.size(); i++){
            if(list.get(i).equals("ENTER")){
                temp += count;
                count = 0;
                map.clear();
            }else{
                map.put(list.get(i), 1);
                count = map.size();
            }
        }
        sb.append(temp + count);
        System.out.println(sb);
    }
}