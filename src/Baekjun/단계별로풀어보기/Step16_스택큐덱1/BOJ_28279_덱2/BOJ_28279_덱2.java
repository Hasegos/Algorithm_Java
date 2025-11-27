package Baekjun.단계별로풀어보기.Step16_스택큐덱1.BOJ_28279_덱2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ_28279_덱2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(bf.readLine());
        for(int i = 0; i < N; i++){
            String[] s = bf.readLine().split(" ");
            if(s[0].equals("1")){
                deque.addFirst(Integer.parseInt(s[1]));
            } else if (s[0].equals("2")) {
                deque.addLast(Integer.parseInt(s[1]));
            }else if (s[0].equals("3")) {
                if(deque.isEmpty()){
                    sb.append("-1").append("\n");
                    continue;
                }
                sb.append(deque.pollFirst()).append("\n");
            }else if (s[0].equals("4")) {
                if(deque.isEmpty()){
                    sb.append("-1").append("\n");
                    continue;
                }
                sb.append(deque.pollLast()).append("\n");
            }else if (s[0].equals("5")) {
                sb.append(deque.size()).append("\n");
            }else if (s[0].equals("6")) {
                if(deque.isEmpty()){
                    sb.append("1").append("\n");
                    continue;
                }
                sb.append("0").append("\n");
            }else if (s[0].equals("7")) {
                if(deque.isEmpty()){
                    sb.append("-1").append("\n");
                    continue;
                }
                sb.append(deque.peekFirst()).append("\n");
            }else if (s[0].equals("8")) {
                if(deque.isEmpty()){
                    sb.append("-1").append("\n");
                    continue;
                }
                sb.append(deque.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}