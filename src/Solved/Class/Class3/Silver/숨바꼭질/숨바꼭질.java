package Solved.Class.Class3.Silver.숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질 {

    static boolean[] visited; // 방문 여부
    static int N,K;
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken()); // 수빈의 위치
        K = Integer.parseInt(st.nextToken()); // 동생의 위치

        // 움직일 필요 x
        if(N == K){
            System.out.println(0);
            return;
        }
        visited = new boolean[100001];
        bfs();
    }
    /* ––––– BFS ––––– */
    public static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        visited[N] = true;
        queue.add(N);

        int count = 0; // 최소 걸린 시간
        while (true){
            count++;
            int size = queue.size();

            /* ––––– queue 의 size 만큼 돌기 (3개씩 늘어남) ––––– */
            for(int i = 0; i < size; i++){
                int x = queue.remove();
                visited[x] = true;

                if (x - 1 == K || x + 1 == K || x * 2 == K) {
                    System.out.println(count);
                    return;
                }
                if (x - 1 >= 0 && !visited[x - 1]) {
                    visited[x - 1] = true;
                    queue.add(x - 1);
                }
                if (x + 1 <= 100000 && !visited[x + 1]) {
                    visited[x + 1] = true;
                    queue.add(x + 1);
                }
                if (x * 2 <= 100000 && !visited[x * 2]) {
                    visited[x * 2] = true;
                    queue.add(x * 2);
                }
            }
        }
    }
}