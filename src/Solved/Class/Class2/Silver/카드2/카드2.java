package Solved.Class.Class2.Silver.카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Queue<Integer> arr = new LinkedList<>();
        for(int i = 0; i < N; i++){
            arr.add(i+1);
        }
        // FIFO
        while (true){
            if(arr.size() == 1){
                System.out.println(arr.peek());
                break;
            }
            arr.poll(); // 삭제
            int temp = arr.poll(); // 그다음 번째
            arr.offer(temp); // 다시 삽입
        }
    }
}