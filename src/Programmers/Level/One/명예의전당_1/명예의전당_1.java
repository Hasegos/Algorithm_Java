package Programmers.Level.One.명예의전당_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class 명예의전당_1 {

    public static void main(String[] args) {
        solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
    }

    public static int[] solution(int k, int[] score){
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>(score.length);
        for(int i = 0; i < score.length; i++){
            if(i > k - 1){
                if(Collections.min(list) < score[i]){
                    list.remove(Collections.min(list));
                }
            }
            if(list.size() < k){
                list.add(score[i]);
            }
            answer[i] = Collections.min(list);
        }
        return answer;
    }

    public static int[] solution2(int k, int[] score){
        int[] answer = new int[score.length];

        // 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            if(pq.size() > k){
                pq.poll();
            }
            answer[i] = pq.peek();
        }
        return answer;
    }
}