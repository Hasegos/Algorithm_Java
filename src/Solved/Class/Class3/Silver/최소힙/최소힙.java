package Solved.Class.Class3.Silver.최소힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 최소힙 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        /* ––––– 우선순위 큐 (우선순위가 낮은거 먼저 출력)––––– */
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(bf.readLine());

            if(a == 0 && list.isEmpty()){
                sb.append(0).append("\n");
                continue;
            }
            if(a == 0) sb.append(list.poll()).append("\n");
            else list.add(a);
        }
        System.out.println(sb);
    }
}