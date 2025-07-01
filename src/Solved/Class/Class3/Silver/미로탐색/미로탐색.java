package Solved.Class.Class3.Silver.미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {

    static char[][] arr; // 주어진 배열
    static boolean[][] visited; // 방문여부
    static int[] dx = {0, 0, -1, 1}; // 상하 좌우
    static int[] dy = {-1, 1, 0, 0};
    static int now_x,now_y, N, M;
    static int[][] dist; // 최단 거리
    public static void main(String[] args) throws IOException {

        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken()); // Y
        M = Integer.parseInt(st.nextToken()); // X

        arr = new char[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        dist = new int[N + 1][M + 1];

        for(int i = 1; i <= N; i++){
            String s = bf.readLine();
            for(int j = 1; j <= M; j++){
                arr[i][j] = s.charAt(j - 1);
            }
        }
        bfs(1,1);
        System.out.println(dist[N][M]);
    }

    /* ––––– BFS ––––– */
    public static void bfs(int startY, int startX){        
        Queue<int[]> queue = new ArrayDeque<>(); // BFS 를 위해 Queue 사용
        visited[startY][startX] = true; // 방문
        dist[startY][startX] = 1; // 처음방문한곳
        queue.offer(new int[]{startY,startX});

        /* ––––– 끝 지점 도착 ––––– */
        if(startY == N && startX == M){ return; }

        while (!queue.isEmpty()){
            int[] c = queue.poll();
            int y = c[0] , x = c[1];

            /* ––––– 상, 하, 좌, 우 이동 ––––– */
            for(int i = 0; i < 4; i++){
                now_x = x + dx[i];
                now_y = y + dy[i];

                if(range() && !visited[now_y][now_x]
                        && arr[now_y][now_x] == '1'){
                    visited[now_y][now_x] = true;
                    // 최단 거리 측정
                    dist[now_y][now_x] = dist[y][x] + 1;
                    queue.offer(new int[]{now_y,now_x});
                }
            }
        }
    }
    /* ––––– 범위 초과 여부 ––––– */
    public static boolean range(){
        return (now_x <= M && now_x > 0 && now_y <= N && now_y > 0);
    }
}