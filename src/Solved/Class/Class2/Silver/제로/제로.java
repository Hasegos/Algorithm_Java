package Solved.Class.Class2.Silver.제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());
        zero(k, bf);
    }
    // LIFO (0일 경우 마지막에있는 숫자 삭제)
    public static void zero(int k, BufferedReader bf) throws IOException {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< k; i++){
            int a = Integer.parseInt(bf.readLine());
            if(a == 0){
                stack.pop();
                continue;
            }
            stack.push(a);
        }
        int result = 0;
        for(int i = 0; i < stack.size(); i++){
            result += stack.get(i);
        }
        System.out.println(result);
    }
}