package Solved.Class.Class2.Silver.균형잡힌세상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = bf.readLine();
            // . 일경우 입력 종료
            if (s.equals(".")){
                break;
            }
            search(s);
        }
    }
    public static void search(String s){
        int count = 0;

        /*
        *   Stack (스택)
        *
        *   LIFO (Last In First Out)
        *   후입 선출 : 나중에 온게 먼저 나간다.
        *
        *   스택을 통해서 해당 문자가 짝지어있는지 확인한다.
        * */

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i)); // ( , [ 스택에 넣기
            }
            if(s.charAt(i) == ')'){
                if (stack.empty() || stack.peek() != '('){
                    count ++;
                    break;
                }
                else{
                    stack.pop();
                }
            }
            else if(s.charAt(i) == ']'){
                if(stack.empty() || stack.peek() != '['){
                    count++;
                    break;
                }
                else {
                    stack.pop();
                }
            }
        }

        // 스택값들이 비어있고 짝들이 맞다면
        if(stack.empty() && count == 0){
            System.out.println("yes");
        }
        // 하나라도 안되어있다면
        else{
            System.out.println("no");
        }
    }
}