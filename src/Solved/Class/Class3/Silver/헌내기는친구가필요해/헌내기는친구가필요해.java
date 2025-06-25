package Solved.Class.Class3.Silver.헌내기는친구가필요해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 헌내기는친구가필요해 {

    static char[][] arr;
    static boolean[][] visited; // 방문여부 
    static int[] dx = {0, 0, -1, 1}; // 상하 좌우
    static int[] dy = {-1, 1, 0, 0}; // 상하 좌우
    static int N, M, count = 0;
    public static void main(String[] args) throws IOException {

        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String a = bf.readLine();
            for(int j = 0; j < M; j++){
                arr[i][j] = a.charAt(j);
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(arr[i][j] == 'I'){
                    dfs(i,j);
                    break;
                }
            }
        }
        System.out.println(count == 0 ? "TT" : count);
    }

    /* DFS 상하좌우 움직이기 */
    public static void dfs(int y, int x){
        visited[y][x] = true;
        for(int i = 0; i < 4; i++){
            int new_x = x + dx[i];
            int new_y = y + dy[i];

            /* ––––– X 아닐때 P 가 존재하는지 확인 ––––– */
            if(range(new_y,new_x) && visited[new_y][new_x] == false && arr[new_y][new_x] != 'X'){
                if(arr[new_y][new_x] == 'P'){
                      count++;
                }
                dfs(new_y,new_x);
            }
        }
    }

    /* 범위 초과 비교 */
    public static boolean range(int new_y, int new_x){
        return (new_x < M && new_x >= 0 && new_y < N && new_y >= 0);
    }
}