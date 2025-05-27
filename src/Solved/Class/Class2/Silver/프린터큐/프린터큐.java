package Solved.Class.Class2.Silver.프린터큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class 프린터큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < T; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서의 개수
            int M = Integer.parseInt(st.nextToken()); // 몇번째에 놓인지 확인

            st = new StringTokenizer(bf.readLine()); // 문서들의 중요도
            LinkedList<int[]> arr = new LinkedList<>();

            for(int j = 0; j < N; j++){
                int n = Integer.parseInt(st.nextToken());
                // 중요성 , 위치
                arr.add(new int[]{n,j});
            }
            importQueue(arr,M,sb);
        }
        System.out.println(sb);
    }
    public static void importQueue(LinkedList<int[]> arr, int M,StringBuilder sb) {

        // 높은 우선순위를 가진 값 순서대로 (중요도)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] doc : arr){
            pq.add(doc[0]);
        }
        int count = 0;
        while (true) {
            int[] front = arr.poll(); // 맨처음
            int frontNumber = front[0]; // 수
            int frontIdx = front[1]; // 위치

            // 큰 경우일 경우
            if (frontNumber < pq.peek()) {
                arr.add(front);
            } else {
                count++;
                pq.poll();

                if (frontIdx == M) {
                    sb.append(count).append("\n");
                    break;
                }
            }
        }
    }
}