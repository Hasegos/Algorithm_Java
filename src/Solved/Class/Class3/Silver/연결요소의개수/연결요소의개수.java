package Solved.Class.Class3.Silver.연결요소의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연결요소의개수 {

    public static int[][] arr;
    public static boolean[] visited; // 방문 여부
    public static int count; // 연결요소의 개수
    public static int N, M;
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = 0;
        
        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수

        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        /* ––––– 노드 연결 ––––– */
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        /* ––––– 1 ~ N 까지 돌면서 연결이 끊기는 시험 ++  ––––– */
        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    /* ––––– DFS 를 통해 연동 확인 (재귀방식) ––––– */
    public static void dfs(int V){
        visited[V] = true;

       for(int i = 1; i <= N; i++){
           if(visited[i] == false && arr[V][i] == 1){
               dfs(i);
           }
       }
    }
}