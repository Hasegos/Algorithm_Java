package Baekjun.단계별로풀어보기.Step18_심화2.BOJ_20920_영단어암기는괴로워;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_20920_영단어암기는괴로워 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = bf.readLine().split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < Integer.parseInt(s[0]); i++){
            String word = bf.readLine();
            if(word.length() >= Integer.parseInt(s[1])){
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(new Comparator<Map.Entry<String, Integer>>() {
              @Override
              public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                  if(!o1.getValue().equals(o2.getValue())){
                      return o2.getValue() - o1.getValue();
                  }
                  if(o1.getKey().length() != o2.getKey().length()){
                    return o2.getKey().length() - o1.getKey().length();
                  }
                  return o1.getKey().compareTo(o2.getKey());
              }
          }
        );

        for(Map.Entry<String, Integer> word : list){
            sb.append(word.getKey()).append("\n");
        }
        System.out.println(sb);
    }
}