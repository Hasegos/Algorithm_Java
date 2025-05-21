package Solved.Class.Class2.Silver.체스판다시칠하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기 {

    // 전체 배열 공간 
    public static boolean[][] arr;
    public static int min = 64; // 8 x 8 색칠 횟수 (검은색 : 32 , 하얀색 : 32)

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new boolean[N][M];

        for(int i =0; i < N; i++){
            String a = bf.readLine();
            for(int j = 0; j < M; j++){
                if(a.charAt(j) == 'W'){
                    arr[i][j] = true;
                }
                else{
                    arr[i][j] = false;
                }
            }
        }
        // 경우의수 -> 기본 8 x 8 일때 1가지
        int N_row = N - 7;
        int M_col = M - 7;

        for(int i = 0; i < N_row; i++){
            for(int j = 0; j< M_col; j++){
                find(i, j);
            }
        }
        System.out.println(min);
    }
    public static void find(int x,int y){
        // 최대 크기
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0; // 횟수
        boolean TF = arr[x][y]; // -> 첫번쨰 색깔
        
        /*
        *  TF 를 통해 첫번째 색깔 찾기
        *  ex) TF -> W (true) / TF -> B (false)
        *
        *  count : 색칠 횟수        *
        * 우리가 기대한 색상 : TF
        * 실제 그다음 색상 : arr[i][j]
        *
        * 다르면 count++
        * 같으면 그다음칸 이동
        * 
        * */

        for(int i = x; i < end_x; i++){
            for(int j = y; j < end_y; j++){
                if(TF != arr[i][j]){
                    count++;
                }
                TF = (!TF);
            }
            // 같은 변에 공유하는 곳은 변하기
            TF = (!TF);
        }
        count = Math.min(count,(64 - count));
        min = Math.min(min, count);
    }
}