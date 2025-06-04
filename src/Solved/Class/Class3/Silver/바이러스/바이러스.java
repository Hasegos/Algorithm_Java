package Solved.Class.Class3.Silver.바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class 바이러스 {

    public static ArrayList<Integer>[] list; // DFS 노드
    public static boolean[] isTrue; // 방문 여부
    public static int count = 0; // 1의 종속된 컴퓨터의 수

    /* ––––– DFS (Depth-First Search) ––––– */
    public static void DFS_Stack(int i){
        Stack<Integer> stack = new Stack<>();
        stack.push(i);
        isTrue[i] = true;
        
        while (!stack.isEmpty()){
            int temp = stack.pop();
            // 해당 노드의 자식노드가 없을 때 까지
            if(!list[temp].isEmpty()){
                // 해당 노드에 있는 자식들 가져오기
                for(int j : list[temp]){
                    if(!isTrue[j]){
                        stack.push(j);
                        isTrue[j] = true;
                        count++;
                    }
                }
            }
        }
    }
    /* ––––– DFS (Depth-First Search) ––––– */
    public static void DFS_Recursion(int i){
        isTrue[i] = true;

        for(int j : list[i]){
            if(!isTrue[j]){
                count++;
                DFS_Recursion(j);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 컴퓨터 수
        int T = Integer.parseInt(bf.readLine()); // 컴퓨터의 쌍수

        list = new ArrayList[N + 1];
        isTrue = new boolean[N + 1];

        /* ––––– 입력받은 크기만큼 각 배열의 노드 연결 ––––– */
        for(int i = 1; i <= N; i++){
            list[i] = new ArrayList<>();
            isTrue[i] = false;
        }

        /* ––––– 양방향으로 노드 연결 ––––– */
        for(int j = 0; j < T; j++){ // 쌍 입력
            String[] s = bf.readLine().split(" ");
            list[Integer.parseInt(s[0])].add(Integer.parseInt(s[1]));
            list[Integer.parseInt(s[1])].add(Integer.parseInt(s[0]));
        }
        /* ––––– DFS (Depth-First Search) ––––– */
        DFS_Recursion(1);
        System.out.println(count);
    }
}