package Baekjun.Stage32.가장긴증가하는부분수열4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열4 {

    static int[] arr; // 배열
    static int[] trace; // 역추적
    static int result = 0; // 결과 개수
    static int A; // 입력값
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(bf.readLine());
        arr = new int[A + 1];
        trace = new int[A + 1];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 1; i <= A; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        sequence();
    }

    public static void sequence(){

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= A; i++){
            trace[i] = 1;
            for(int j = 0; j < i; j++){
                // 앞전에 있었던 값보다 클때 길이 추가
                if(arr[i] > arr[j]){
                    // 앞전에 있는길이 + 1 vs  현재 길이중 큰값 가지기
                    trace[i] = Math.max(trace[j] + 1, trace[i]);
                    // 최대 길이 구하기
                    result = Math.max(trace[i], result);
                }
            }
        }

        /*
        * 각 부분 수열에대한 길이를 구한다.
        *
        * 10 20 10 30 20 50 일 경우
        * 1  2  1  3  2  4 <- 각 대응하는 원소 값
        * 이후에 해당 원소들을 거꾸로 출력하면
        * 10 20 30 50 이 출력이 된다.
        * */

        int value = result;
        /* ––––– 각 원소에 대응하는 값 넣기 ––––– */
        Stack<Integer> stack = new Stack<>();        
        for(int i = A; i >= 1; i--){
            if(value == trace[i]){
                stack.push(arr[i]);
                value--;
            }
        }
        /* ––––– 넣은 순서 반대로 출력 ––––– */
        while (!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        
        System.out.println(result);
        System.out.println(sb);
    }
}