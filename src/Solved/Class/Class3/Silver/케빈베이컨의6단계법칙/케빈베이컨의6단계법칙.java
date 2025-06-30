package Solved.Class.Class3.Silver.케빈베이컨의6단계법칙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 케빈베이컨의6단계법칙 {

    static ArrayList<Integer>[] arr;
    static int[] visited; // 방문 여부
    static int result = 0,N;

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken()); // 유저의 수
        int M = Integer.parseInt(st.nextToken()); // 친구 관계 수

        arr = new ArrayList[N + 1];
        visited = new int[N + 1];
        for(int i = 1; i <= N; i++){
            arr[i] = new ArrayList<>();
        }

        for(int i = 1; i <= M; i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a].add(b); // 양방향으로 연동
            arr[b].add(a);
        }
        solution();
    }

    public static void solution(){
        int minCnt = Integer.MAX_VALUE, minIdx = 0; // 최소 카운트와 정점 번호
        for(int i = 1; i <=N; i++){
            int cnt = bfs(i);
            if(minCnt > cnt){ // 가장 작은값 찾기
                minCnt = cnt;
                minIdx = i;
            }
        }
        System.out.println(minIdx);
    }

    /* ––––– BFS ––––– */
    public static int bfs(int start){

        Arrays.fill(visited,-1);
        Queue<Integer> queue = new LinkedList<>();
        result = 0; // 케빈 베이컨의 수
        queue.add(start);
        visited[start] = 0; // 방문

        while (!queue.isEmpty()){
            int n = queue.poll();

            for(int a : arr[n]){
                if(visited[a] != -1) continue; // 자기 자신 제외
                visited[a] = visited[n] + 1; // 현 위치에서 한칸 움직이기
                result += visited[a]; // 결과값에 추가
                queue.add(a);
            }
        }
        return result;
    }
}