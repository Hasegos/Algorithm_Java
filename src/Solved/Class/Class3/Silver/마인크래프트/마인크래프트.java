package Solved.Class.Class3.Silver.마인크래프트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 마인크래프트 {

    public static int[][] arr; // 배열
    public static int N,M,B,min = 256, max = 0, answer = Integer.MAX_VALUE, height = 0;
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken()); // 세로
        M = Integer.parseInt(st.nextToken()); // 가로
        B = Integer.parseInt(st.nextToken()); // 인벤토리에 가지고있는 블럭개수

        arr = new int[N + 1][M + 1];

        /* ––––– 입력값중에서 가장 최솟값, 가장 최댓값 구하기 ––––– */
        for(int i = 1; i <= N; i++ ) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 1; j <= M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                min = Math.min(min,arr[i][j]);
                max = Math.max(max,arr[i][j]);
            }
        }
        /* ––––– 최대의 길이를 구해야함으로 최대 -> 최소 움직이기 ––––– */
        for(int i = max; i >= min; i--){
            checkArr(i);
        }
        System.out.print(answer + " " + height);
    }

    /* ––––– 최대 길이와 최소 시간 구하기 ––––– */
    public static void checkArr(int h){
        int time = 0; // 시간 계산
        int b = B; // 인벤토리에 가지고있는 블럭 개수

        for(int i = 1; i <= N; i++ ) {
            for (int j = 1; j <= M; j++) {
                if(time > answer){
                    return;
                }
                /* 땅 고르기 */
                else if(arr[i][j] > h){
                    int sub = arr[i][j] - h;
                    time +=  (sub * 2);
                    b += sub;
                }
                /* 블럭 추가 */
                else if(arr[i][j] < h){
                    int sub = h - arr[i][j];
                    time += sub;
                    b -= sub;
                }
            }
        }
        /* 최소 시간 비교 & 최대 높이 설정 */
        if(b >= 0 && answer > time){
            answer = time;
            height = h;
        }
    }
}