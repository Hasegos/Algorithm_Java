package Solved.Class.Class3.Silver.색종이만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이만들기 {

    static int[][] arr; // 정사각형 배열 공간
    static int blue = 0; // blue 색상
    static int white = 0; // white 색상
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader  bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(bf.readLine());
        arr = new int[N][N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /* ––––– 4등분 ––––– */
        divide(0,0,N);
        System.out.println(white);
        System.out.println(blue);
    }

    /* ––––– 각 사분면에서 색상이 연속으로 같은색인지 판단  ––––– */
    public static void divide(int y,int x,int N){
        if(sameColor(y,x,N)){
            if(arr[y][x] == 0){ white++; }
            else{ blue ++; }
            return;
        }
        int newSize = N / 2;
        divide(y, x,newSize); // 제 2사분면
        divide(y+newSize , x, newSize); // 제 3사분면
        divide(y , x + newSize, newSize); // 제 1사분면
        divide(y+newSize ,x + newSize, newSize); // 제 4사분면
    }

    /* ––––– 전부다 같은 색상일 경우만 true  ––––– */
    public static boolean sameColor(int y, int x,int N){
        int color = arr[y][x];
        for(int i = y; i < y + N; i++){
            for(int j = x; j < x + N; j++){
                if(color != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}