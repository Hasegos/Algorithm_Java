package Baekjun.단계별로풀어보기.Step16_스택큐덱1.BOJ_18258_큐2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ_18258_큐2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0; i < N; i++){
            String[] s = bf.readLine().split(" ");
            if(s[0].equals("push")){
                deque.addLast(Integer.parseInt(s[1]));
            }
            else if(s[0].equals("pop")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.pollFirst()).append("\n");
            }
            else if(s[0].equals("size")){
                sb.append(deque.size()).append("\n");
            }
            else if(s[0].equals("empty")){
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                    continue;
                }
                sb.append(0).append("\n");
            }
            else if(s[0].equals("front")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.getFirst()).append("\n");
            }
            else if(s[0].equals("back")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.getLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}