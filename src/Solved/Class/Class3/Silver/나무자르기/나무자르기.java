package Solved.Class.Class3.Silver.나무자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나무자르기 {

    static int arr[];
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 집에 가져갈 나무의 길이

        arr = new int[N];
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        /* ––––– 나무의 최대 길이 구하기 ––––– */
        binarySearch(M);
    }

    public static void binarySearch(int M){
        int max = 0, min = 0;
        long check = 0; // 나무의 최대 길이
        /* ––––– 가장 큰 나무의 길이 구하기 ––––– */
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        /*
         *  가장 큰 나무의 길이로 설정후
         *  해당 길이의 절반길이로 시작, 이후에 각 나무의 길이를 빼기 (단, 절반보다 작은 나무는 제외)
         *  뺀후 남은 길이를 모두 더해준뒤 M보다 크거나 같아야함.
         *  다 더해준 길이들 중에서 가장 큰 길이 (나무의 최대 길이) 를 구해준다.
         *  */
        while (min <= max){
            int mid = (max + min) / 2;
            long result = 0;

            for(int i = 0; i < arr.length; i++){
                // max 길이 보다 작은 나무들은 Pass
                if(arr[i] < mid){
                    continue;
                }
                result += (arr[i] - mid);
            }
            // M 보다 크거나 같은 값들 중
            if(result >= M){
                // 가장 큰 길이를 구하기
                if(check < mid){
                    check = mid;
                }
                min = mid + 1;
            }
            else{
                max = mid - 1;
            }
        }
        System.out.println(check);
    }
}