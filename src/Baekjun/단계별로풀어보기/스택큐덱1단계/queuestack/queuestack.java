package Baekjun.단계별로풀어보기.스택큐덱1단계.queuestack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class queuestack {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s1 = bf.readLine().split(" ");
        String[] s2 = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int M = Integer.parseInt(bf.readLine());
        String[] s3 = bf.readLine().split(" ");

        int count = 0;
        for(int i = 0; i <  s1.length; i++){
            if(Integer.parseInt(s1[i]) == 0){
                deque.addFirst(Integer.parseInt(s2[i]));
                count ++;
            }
        }

        for(int i = 0; i < s3.length - count; i++){
            deque.addLast(Integer.parseInt(s3[i]));
        }
        for(int i = 0; i < M; i++){
            sb.append(deque.pollFirst()).append(" ");
        }
        System.out.println(sb);
    }
}