package Baekjun.단계별로풀어보기.Step16_스택큐덱1.BOJ_2346_풍선터뜨리기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_2346_풍선터뜨리기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        Deque<int[]> arr = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            arr.add(new int[]{i + 1, Integer.parseInt(s[i])}); // 풍선 번호, 이동 값
        }

        while (true){
            if(arr.size() == 1){
                break;
            }
            int[] cur = arr.pollFirst();
            int move = cur[1];
            sb.append(cur[0]).append(" ");
            if(move > 0){
                for(int j = 0; j < (move - 1); j++){
                    arr.addLast(arr.pollFirst());
                }
            }else {
                for (int j = 0; j < (Math.abs(move)); j++) {
                    arr.addFirst(arr.pollLast());
                }
            }
        }
        sb.append(arr.pollFirst()[0]);
        System.out.println(sb);
    }
}