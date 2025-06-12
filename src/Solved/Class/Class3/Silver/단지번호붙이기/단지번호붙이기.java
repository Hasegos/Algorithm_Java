package Solved.Class.Class3.Silver.단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 단지번호붙이기 {
    static int[][] arr; // 배열 크기
    static int[] dx = {0, 0, -1, 1}; // x좌표 상하좌우
    static int[] dy = {-1, 1, 0, 0}; // y좌표 상하좌우
    static int now_x,now_y, N, count; // now_x,now_y : 상하좌우 이동후 좌표 , N : 크기 , count : 단지 수
    static boolean[][] visited; // 방문 여부
    static int blockNumber = 0; // 단지내의 집 수
    public static void main(String[] args) throws IOException {

        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(bf.readLine());
        arr = new int[N][N]; // 배열 크기
        visited = new boolean[N][N]; // 방문 여부
        for(int i = 0; i < N; i++){
            String s = bf.readLine();
            for(int j = 0; j < N; j++){
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        /* ––––– 오름차순을 위한 list ––––– */
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(visited[i][j] == false && arr[i][j] == 1 ){
                    count ++;
                    list.add(blockNumber);
                    complexNumber(i,j);
                    blockNumber = 0;
                }
            }
        }
        // 오름 차순
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(count);
        System.out.println(sb);
    }
    /* ––––– 상하 좌우 이동해서 판단 (연동 되어있으면 집수 ++) ––––– */
    public static void complexNumber(int y, int x){
        visited[y][x] = true;
        blockNumber ++;
        if(arr[y][x] == 0) return;
        for(int i = 0; i < 4; i++){
            now_y = y + dy[i]; // 상하좌우로 움직이기 위해
            now_x = x + dx[i];
            if(range() && arr[now_y][now_x] == 1 && visited[now_y][now_x] == false){
                complexNumber(now_y,now_x);
            }
        }
    }
    /* ––––– 만들어진 배열 크기 초과 x ––––– */
    public static boolean range(){
        return (now_y < N && now_y >= 0 && now_x < N && now_x>= 0);
    }
}