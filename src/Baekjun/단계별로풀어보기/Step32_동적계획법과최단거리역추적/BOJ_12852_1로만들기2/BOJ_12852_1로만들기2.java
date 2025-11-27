package Baekjun.단계별로풀어보기.Step32_동적계획법과최단거리역추적.BOJ_12852_1로만들기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_12852_1로만들기2 {

    static int[] arr; // 배열
    static int[] trace; // 추적
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        arr = new int[N + 1];
        trace = new int[N + 1];
        dp(N);
    }
    /* ––––– 횟수와 숫자 역추적 확인 ––––– */
    public static void dp(int N){
        StringBuilder sb = new StringBuilder();
        arr[1] = 0;
        for(int i = 2; i <= N; i++){
            arr[i] = arr[i - 1] + 1; // 횟수 저장
            trace[i] = i - 1; // 해당 숫자 저장
            /*
             *  예를들어 1에서 3으로 갈때  1 -> 2 -> 3 / 1 -> 3
             *  이렇게 두가지가 존재한다.
             *
             *  경우의수로 보면 전자는 2 후자는 1 이다.
             *  그럼으로 횟수가 적은 1 -> 3으로 가는 경우로 저장해야된다.
             *
             *  즉, i > i/2 + 1 인 경우를 찾으면된다.
             *  또한 i % 2 == 0 조건을 채워야한다.
             *
             *  이렇게 거꾸로 채워나가면된다.
             */

            /* ––––– 2로 나눠지면서 경우의수가 매번 1씩 커지는 것보다 작을때 ––––– */
            if(i % 2 == 0 && arr[i] > arr[i / 2] + 1){
                arr[i] = arr[i / 2] + 1;
                trace[i] = i / 2;
            }
            /* ––––– 3으로 나눠지면서 경우의수가 매번 1씩 커지는 것보다 작을때 ––––– */
            if(i % 3 == 0 && arr[i] > arr[i / 3] + 1){
                arr[i] = arr[i / 3] + 1;
                trace[i] = i / 3;
            }
        }
        System.out.println(arr[N]);
        // 추적한 배열에 저장된 값 불러오기
        // (10 위치에는 9가 있고 9위치에는 3이 있음 이를 이용한다.)
        while (N > 0){
            sb.append(N).append(" ");
            N = trace[N];
        }
        System.out.println(sb);
    }
}