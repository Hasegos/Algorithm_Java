package Solved.Class.Class3.Silver.과일탕후루;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 과일탕후루 {

    public static void main(String[] args) throws IOException {

        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> map = new HashMap<>();
        int N = Integer.parseInt(bf.readLine());
        int left = 0, answer = 0; // answer : 답 , left : 왼쪽 (앞에서부터 확인)
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < arr.length; i++){
            /* 기존 값이 존재하면 ++ 해주기 */
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);

            /* 길이가 3초과하면 */
            while (map.size() > 2){

                /* 만약 해당값이 존재하면 -- 하기 */
                map.put(arr[left], map.get(arr[left])-1);
                /* 만약 0이라면 삭제하기 */
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
            /* 오른 - 왼 + 1 */
            answer = Math.max(answer,i - left + 1);
        }
        System.out.println(answer);
    }
}