package Solved.Class.Class2.Silver.수정렬하기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 수정렬하기2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        countingSort(N,bf); // Counting Sort
        CollectionsSort(N,bf); // Collections Sort
    }
    public static void CollectionsSort(int N, BufferedReader bf) throws IOException {
        // Collections.sort() 최악의 시간복잡도 O(nlog(n))
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N; i++){
            arr.add(Integer.parseInt(bf.readLine()));
        }
        bf.close();

        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }    
    
    public static void countingSort(int N, BufferedReader bf) throws IOException {
        // 절댓값 범위가 1,000,000 까지 이기에 음수도 생각해야됨
        boolean[] arr = new boolean[2000001]; // -1,000,000 ~ 1,000,000

        for(int i = 0; i < N; i++){
            arr[Integer.parseInt(bf.readLine()) + 1000000] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < arr.length; j++){
            if(arr[j]){
                sb.append(j - 1000000).append("\n");
            }
        }
        System.out.println(sb);
    }
}