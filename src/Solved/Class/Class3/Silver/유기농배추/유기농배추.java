package Solved.Class.Class3.Silver.유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유기농배추 {

    static int[][] arr; // 배열
    static boolean [][] visited; // 방문
    static int[] dx = {0, 0, -1, 1}; // X 좌표 기준 상하좌우
    static int[] dy = {-1, 1, 0, 0}; // y 좌표 기준 상하좌우
    static int M, N; // x, y 좌표
    static int now_x,now_y; // 상하좌우 움직인뒤 좌표

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());

        /* ––––– 입력받은 개수만큼 배열 생성 ––––– */
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(bf.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken()); 
            arr = new int[N][M];
            visited = new boolean[N][M];
            int K = Integer.parseInt(st.nextToken()); // 배추 수

            // 방문한곳은 1로 색칠
            for(int j = 0; j < K; j++){
                st = new StringTokenizer(bf.readLine());
                int x = Integer.parseInt(st.nextToken()); // x좌표
                int y = Integer.parseInt(st.nextToken()); // y좌표
                arr[y][x] = 1;
            }            
            
            int count = 0; // 최소 지렁이의 수
            // 배열크기만큼 돌면서 확인
            for(int j = 0; j < N; j++){ // y좌표
                for(int k = 0; k < M; k++){ // x좌표
                    if(arr[j][k] == 1 && visited[j][k] == false){
                        count++;
                        dfs(k,j);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    // 재귀 방식 (상하좌우로 이동해서 방문여부 확인)
    public static void dfs(int x, int y){
        visited[y][x] = true;
        for(int i = 0; i < 4; i++){
            // 상하 좌우 x, y  좌표 이동
            now_x = x + dx[i];
            now_y = y + dy[i];

            if(range() && visited[now_y][now_x] == false && arr[now_y][now_x] == 1){
                dfs(now_x,now_y);
            }
        }
    }

    // 범위를 안넘어가는지 확인
    public static boolean range(){
        return (now_x >= 0 && now_x < M && now_y >=0 && now_y < N);
    }
}