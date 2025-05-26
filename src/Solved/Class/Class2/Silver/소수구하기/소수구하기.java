package Solved.Class.Class2.Silver.소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        minority(M,N);
    }
    // 에라토스테네스의 체 (N의 배수값들을 모두 삭제 -> N의 배수값은 소수가아니다)
    public static void minority(int M, int N){
        boolean[] arr = new boolean[N + 1];

        for(int i = 2; i <= N; i++){
            if(arr[i]) continue;
            for(int j = i * 2; j <= N; j+=i){
                if(arr[i]) continue;
                if(j % i == 0) arr[j] = true;
            }
        }
        for(int i = 2; i <= N; i++){
            if(arr[i] || i < M){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}