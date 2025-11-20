package Baekjun.단계별로풀어보기.스택큐덱1단계.도키도키간식드리미;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 도키도키간식드리미 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()) , next = 1;
        String[] s = bf.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        for(int i = 0; i < N; i++){
            int cur = arr[i];
            if(next == cur){
                next++;
            }
            else{
                stack.push(cur);
            }
            while (!stack.isEmpty() && stack.peek() == next){
                stack.pop();
                next++;
            }
        }
        if(stack.isEmpty()){
            System.out.println("Nice");
        }
        else{
            System.out.println("Sad");
        }
    }
}