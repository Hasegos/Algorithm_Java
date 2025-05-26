package Solved.Class.Class2.Silver.요세푸스문제0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제0 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        josephus(N,K);
    }
    public static void josephus(int N, int K){
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            queue.add(i + 1);
        }
        sb.append("<");
        int i = 1;
        while (true){
            if(queue.isEmpty()){
                break;
            }
            if(i == K){
                if(queue.size() == 1){
                    sb.append(queue.peek()).append(">");
                }
                else{
                    sb.append(queue.peek()).append(", ");
                }
                queue.remove();
                i = 1;
                continue;
            }
            queue.add(queue.poll());
            i++;
        }
        System.out.println(sb);
    }
}