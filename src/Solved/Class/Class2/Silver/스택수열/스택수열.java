package Solved.Class.Class2.Silver.스택수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class 스택수열 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>(); // 여기에는  넣기

        // 시작값
        int start = 0;

        // 1 ~ n 까지 수 입력받기
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(bf.readLine());

            // 1 ~ N 까지 오름차순으로
            if(a > start){
                for(int j = start + 1; j <= a; j++){
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = a;
            }
            // 만약 탑에 있는 값과
            else if(stack.peek() != a) {
                System.out.println("No");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}