package Baekjun.Stage19.별찍기10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기10 {

    static char[][] arr;
    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        arr = new char[N][N];
        star(0,0, N, false);

        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    /* ––––– 입력받은 크기만큼 * 찍기 ––––– */
    public static void star(int x, int y, int N, boolean blank){

        /* ––––– 만약 빈칸일 경우 ––––– */
        if(blank){
            for(int i = x; i < x + N; i++){
                for (int j = y; j < y + N; j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        /* ––––– 빈칸이 아니고 더이상 쪼갤 수 없을때 * 찍기 ––––– */
        if(N == 1){
            arr[x][y] = '*';
            return;
        }

        int size = N / 3;
        int count = 0;
        /* ––––– N / 3 나눈 크기에서 가운데 5일때 빈칸표시 ––––– */
        for(int i = x; i < x + N; i += size){
            for(int j = y; j < y + N; j += size){

                /* N 이 3일때
                 *   ***
                 *   * *
                 *   ***
                 *
                 *  이렇게 찍어야된다.
                 *  그럼 빈칸은 순차적으로 봤을때 5일때 빈칸이 생김
                 *  이를 해결하기위해 count 를 세줘서 5일때를 찾는다.
                 * */

                count ++;
                if(count == 5){
                    star(i,j,size,true);
                }
                else{
                    star(i,j,size,false);
                }
            }
        }
    }
}