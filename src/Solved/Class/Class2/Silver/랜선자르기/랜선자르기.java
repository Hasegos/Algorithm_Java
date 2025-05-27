package Solved.Class.Class2.Silver.랜선자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 랜선자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int K = Integer.parseInt(st.nextToken()); // 랜선의 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 개수
        int arr[] = new int[K];

        for(int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        cutRan(arr,N);
    }
    public static void cutRan(int[] arr, int N){
        long max = 0;

        // 가장 큰 길이 판별
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        // 최대길이가
        max++;
        // min : 최대길이 값,  mid : 이분탐색을위한 값
        long min = 0, mid = 0;

        /* 가장 큰 길이를 기준으로
        *
        * 이분탐색을 통해 나눈 값들의 합과 입력받은 값이 같은지 확인
        * 만약 값이 작을 경우 다시 이부탐색을 통해 판별
        *
        * max 는 0 ~ max 까지가 아니라 0 ~ max + 1 까지 확인한다.
        * 이유 : min 값이 0일때 mid 는 0이며 0 으로 나누는 불상사가 발생
        * -> max 초기값에 + 1 해주기 (어차피 나누기때문에 차이가없다)
        */

        while (min < max){
            mid = (min + max) / 2;

            long count = 0;
            for(int i = 0; i <arr.length; i++){
                count += (arr[i] / mid);
            }
            if(count < N){
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}