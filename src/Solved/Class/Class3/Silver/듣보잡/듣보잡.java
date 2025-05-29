package Solved.Class.Class3.Silver.듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 듣보잡 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        /* ––––– 사용자로부터 입력받은 내용 저장 ––––– */
        Map<Integer,String> listen = new HashMap<>(); // 듣도
        Map<String,Integer> see = new HashMap<>(); // 보도
        // O(n)
        for(int i = 0; i < N; i++){
            listen.put(i,bf.readLine());
        }
        // O(n)
        for(int i = 0; i < M; i++){
            see.put(bf.readLine(), i);
        }

        /* ––––– 입력받은 내용 같은 내용 저장 ––––– */
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int count = 0; // 몇개인지

        // O(n) -> listen 의 value 값이 see 의 키값에 포함되어있으면 저장
        for(int i = 0; i < N; i++){
            String name = listen.get(i);
           if(see.containsKey(name)){
               list.add(listen.get(i));
               count++;
           }
        }

        /* ––––– 입력받은 내용 같은 정렬 ––––– */
        ArrayList<String> arr2 = new ArrayList<>(list);
        // O(nlog(n))
        Collections.sort(arr2);
        // O(1)
        sb.append(count).append("\n");
        for(int i = 0; i < list.size();i++){
            sb.append(arr2.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}