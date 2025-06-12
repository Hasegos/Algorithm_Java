package Solved.Class.Class3.Gold.회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 회의실배정 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][] arr = new int[T][2];

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(bf.readLine());
            int t_start = Integer.parseInt(st.nextToken());
            int t_end = Integer.parseInt(st.nextToken());
            arr[i][0]= t_start; // 시작 시간
            arr[i][1]= t_end; //  끝시간
        }

        // 종료 시간 기준으로 정렬, 단 종료시간이 같으면 시작시간으로 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 끝 시간 이 같다면 시작시간이 빠른걸로 정렬
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        // 회의실 수
        int count = 0;
        // 그전 미팅 시간
        int pre_meeting = 0;
        for(int i = 0; i < T; i++){
            // 그전 미팅 시간 끝나는 시간이 다음 미팅 시작시간이랑 같다면
            if(pre_meeting <= arr[i][0]){
                // 그전 미팅시간은 다음 미팅 시간의 끝나는 시간으로 설정
                pre_meeting = arr[i][1];
                count++;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}
