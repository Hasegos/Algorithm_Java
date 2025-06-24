package Solved.Class.Class3.Silver.좌표압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 좌표압축 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[N]; // 원본 배열
        int[] new_arr = new int[N]; // 정렬할 배열
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st.nextToken());
            arr[i] = new_arr[i] = a;
        }
        /* ––––– 입력받은 값 정렬 ––––– */
        Arrays.sort(new_arr);

        /* ––––– 키 (입력 값) 이 포함이 되지않으면 값 (위치) 추가 ––––– */
        int number = 0;
        for(int temp : new_arr){
            if(!map.containsKey(temp)){
                map.put(temp, number);
                number ++;
            }
        }

        /* ––––– 원본 순서대로 해당 위치값 출력 ––––– */
        StringBuilder sb = new StringBuilder();
        for(int temp : arr){
            int rank = map.get(temp);
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}