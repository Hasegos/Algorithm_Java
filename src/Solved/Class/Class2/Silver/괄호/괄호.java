package Solved.Class.Class2.Silver.괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++){
            String s = bf.readLine();
            System.out.println(bracket(T,s));
        }
    }

    public static String bracket(int T, String s) {
        // Stack 에 저장후 LIFO
        Stack<Character> stack = new Stack<>();

        for(int j = 0; j < s.length(); j++){

            if(s.charAt(j) == '('){
                stack.push(s.charAt(j));
            }

            if(s.charAt(j) == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return "NO";
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}