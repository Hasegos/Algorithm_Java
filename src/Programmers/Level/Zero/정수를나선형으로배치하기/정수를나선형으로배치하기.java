package Programmers.Level.Zero.정수를나선형으로배치하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 정수를나선형으로배치하기 {

    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        s.solutionForLoop(n);
        s.solutionIfOnly(n);
    }
}

class Solution{
    public int[][] solutionForLoop(int n){
        int [][] answer = new int[n][n];
        int value = 1; // 채워야할 정수값
        int rStart = 0, rEnd = n - 1; // 행
        int cStart = 0, cEnd = n - 1; // 열

        while (value <= (n*n)){

            // ->
            for(int i = cStart; i <= cEnd; i++){
                answer[rStart][i] = value++;
            }
            rStart++;

            // ↓
            for(int i = rStart; i <= rEnd; i++){
                answer[i][cEnd] = value++;
            }
            cEnd--;

            // <-
            for(int i= cEnd; i >= cStart; i--){
                answer[rEnd][i] = value++;
            }
            rEnd--;

            // ↑
            for(int i= rEnd; i >= rStart; i--){
                answer[i][cStart] = value++;
            }
            cStart++;
        }
        return answer;
    }

    public int[][] solutionIfOnly(int n){
        int [][] answer = new int[n][n];
        int direction = 0; // 이동방향 -> 0 : 오른쪽 , 1 : 아래 , 2: 왼쪽, 3: 위
        int value = 1; // 채워야할 정수값
        int row = 0; // 현재 행
        int col = 0; // 현재 열

       while (value <= (n*n)){
           answer[row][col] = value++;

            // 오른쪽 방향
           if(direction == 0){
                if(col == n - 1 || answer[row][col + 1] != 0){
                  direction = 1;
                   row ++; // 아래로 이동
               }
               else {
                    col ++; // 오른쪽으로 이동
                }
            }

            // 아래 방향
            else if(direction == 1){
                if(row == n - 1 || answer[row + 1][col] != 0){
                    direction = 2;
                    col --; //왼쪽으로이동
                }
                else {
                    row ++; // 아래로 이동
                }
            }

            // 왼쪽 방향
            else if(direction == 2){
                if(col == 0 || answer[row][col - 1] != 0){
                    direction = 3;
                    row --; // 위로 이동
                }
                else {
                    col --; // 왼쪽으로 이동
                }
            }

            // 위 방향
            else if (direction == 3){
                if(row == 0 || answer[row - 1][col] != 0){
                    direction = 0;
                    col ++; // 오른쪽 이동
                }
                else{
                    row --; // 위로 이동
                }
            }
        }
       return answer;
    }
}