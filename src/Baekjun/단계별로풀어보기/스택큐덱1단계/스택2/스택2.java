package Baekjun.단계별로풀어보기.스택큐덱1단계.스택2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < T; i++){
            String[] s = bf.readLine().split(" ");
            if(s[0].equals("1")){
                stack.push(Integer.parseInt(s[1]));
            }
            else if(s[0].equals("2")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(stack.pop()).append("\n");
            }
            else if(s[0].equals("3")){
                sb.append(stack.size()).append("\n");
            }
            else if(s[0].equals("4")){
                if(stack.isEmpty()){
                    sb.append(1).append("\n");
                    continue;
                }
                sb.append(0).append("\n");
            }
            else if(s[0].equals("5")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}