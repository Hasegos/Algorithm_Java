package Solved.Class.Class3.Silver.최대힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 최대힙 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        /* 
         *  2^31 이기때문에 Long 타입으로 우선순위 큐 받기 
         *  제일 큰값부터 출력해야되기에 내림 차순으로 정렬
         *  */
        PriorityQueue<Long> queue = new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            /* ––––– Long 타입으로 바꾸기 ––––– */
            long temp = Long.parseLong(bf.readLine());

            if(temp == 0){
                /* ––––– 크기가 0이면 0 ––––– */
                if(queue.size() == 0){
                    sb.append(0).append("\n");
                    continue;
                }
                /* ––––– 입력값이 0이면 가장 큰 값 출력 ––––– */
                sb.append(queue.poll()).append("\n");
                continue;
            }
            queue.add(temp);
        }
        System.out.println(sb);
    }
}