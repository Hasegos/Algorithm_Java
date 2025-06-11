package Solved.Class.Class3.Silver.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS {

    static int[][] arr; // 노드 연결
    static boolean[] visited; // 방문여부
    static int count; // count 값과 노드의 값이 같은지 확인
    public static void main(String[] args) throws IOException {

        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의개수 (총 노드의개수)
        int M = Integer.parseInt(st.nextToken()); // 간선의 개수
        int V = Integer.parseInt(st.nextToken()); // 정점의 번호 V

        arr = new int[1001][1001];
        visited = new boolean[1001];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 양방향이기때문에 서로연결
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        DFS(V,N);
        System.out.println();
        visited = new boolean[1001];
        BFS(V,N);
    }

    /* ––––– BFS (너비 우선 탐색) -> 깊이방식 ––––– */
    public static void BFS(int V,int N){
        Queue<Integer> que = new LinkedList<>();
        que.offer(V); // 지점 넣기
        visited[V] = true; // 방문함
        System.out.print(V + " ");

        while (!que.isEmpty()){
            V = que.poll();

            for(int i = 1; i <= N; i++){
                /* ––––– 그 밑에 부분 돌면서 확인 ––––– */
                if(visited[i] == false && arr[V][i] == 1){
                    que.offer(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
    /* ––––– DFS (깊이 우선 탐색) -> 재귀방식 ––––– */
    public static void DFS(int V,int N){
        visited[V] = true;
        System.out.print(V + " ");
        if(count == N){
            return;
        }
        count++;
        for (int i = 1; i <= N; i++){
            if(visited[i] == false && arr[V][i] == 1){
                DFS(i,N);
            }
        }
    }
}