package Solved.Class.Class2.Silver.나이순정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 나이순정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            String[] split = bf.readLine().split(" ");
            arr[i][0] = split[0];
            arr[i][1] = split[1];
        }
        arraySort(arr, N);
        forSort(arr,N);
    }
    
    public static void arraySort(String[][] arr, int N) {
        /* 비교해서 return 값
        *  return 1 : s1이 오른쪽에 있어야한다
        *  return -1 : s1이 왼쪽에 있어야한다.
        *  return 0 : s1과 s2가 같아야한다.
        * */
        // Comparator 최악의 시간 복잡도 -> O(nlog(n)) 시간
        // 병합 정렬
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                int a = Integer.parseInt(s1[0]);
                int b = Integer.parseInt(s2[0]);
                if(a > b){
                    return 1;
                }
                else if(a < b){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }

    // for -> O(n^2) 만큼 걸림
    public static void forSort(String[][] arr, int N){
        int count = 0;
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(arr[i][0]);
            for(int j = i; j < N; j++){
                if(i == j) continue; // 자기자신 제외
                int b = Integer.parseInt(arr[j][0]);
                if(a > b){
                    count++;
                    String[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                // 왼쪽 이 큰 경우
                if(a == b){
                    if(count > 0){
                        String[] temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        count = 0;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}