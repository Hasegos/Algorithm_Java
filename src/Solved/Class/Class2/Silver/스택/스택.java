package Solved.Class.Class2.Silver.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for(int i = 0; i < N; i++){
            String[] split = bf.readLine().split(" ");
            stack(split);
        }
    }

    public static void stack(String[] split){
        Stack<Integer> stack = new Stack<>();

        // push
        if(split[0].equals("push")){
            stack.push(Integer.parseInt(split[1]));
        }
        // pop
        else if(split[0].equals("pop")){
            if(stack.empty()){
                System.out.println(-1);
            }
            else{
                System.out.println(stack.pop());
            }
        }
        // size
        else if(split[0].equals("size")){
            System.out.println(stack.size());
        }
        // empty
        else if(split[0].equals("empty")){
            if(stack.empty()){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
        // top
        else{
            if(stack.empty()){
                System.out.println(-1);
            }
            else {
                System.out.println(stack.peek());
            }
        }
    }
}