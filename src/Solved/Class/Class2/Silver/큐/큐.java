package Solved.Class.Class2.Silver.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class 큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        // Deque (Double Ended Queue) : LIFO, FIFO 둘다 가능
        Deque<Integer> stack = new LinkedList<>();
        for(int i = 0; i < N; i++){
            String s = bf.readLine();
            queue(s, stack);
        }
    }
    public static void queue(String s, Deque<Integer> stack){
        String[] arr = s.split(" ");
        // push
        if(arr[0].equals("push")){
            stack.add(Integer.parseInt(arr[1]));
        }
        // pop
        else if(arr[0].equals("pop")){
            if(stack.isEmpty()){
                System.out.println(-1);
            }
            else {
                System.out.println(stack.pollFirst());
            }
        }
        // size
        else if(arr[0].equals("size")){
            System.out.println(stack.size());
        }
        // empty
        else if(arr[0].equals("empty")){
            if(stack.isEmpty()){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        // front
        else if(arr[0].equals("front")){
            if(stack.isEmpty()){
                System.out.println(-1);
            }
            else{
                System.out.println(stack.getFirst());
            }
        }
        // back
        else if(arr[0].equals("back")){
            if(stack.isEmpty()){
                System.out.println(-1);
            }
            else{
                System.out.println(stack.getLast());
            }
        }
    }
}