package Programmers.Level.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 정수를나선형으로배치하기 {

    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        s.solution(n);

    }
}

/**
 * 문제 설명
 * 양의 정수 n이 매개변수로 주어집니다.
 * n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로
 * 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 30
 * 입출력 예
 * n	result
 * 4	[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
 * 5	[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 예제 1번의 n의 값은 4로 4 × 4 배열에 다음과 같이 1부터 16까지 숫자를 채울 수 있습니다.
 * 행 \ 열	0	1	2	3
 * 0	1(n-3)	2(n-2)	3(n-1)	4(n)
 * 1	12(n*n-4)	13(n+1 * n -2)	14(n+1 * n-1 - 1)	5 (n+1)
 * 2	11(n*n-5)	16(n*n)	15(n*n-1)	6(n+2)
 * 3	10(n+6)	9(n+5)	8(n+4)	7(n+3)
 */

/**
 * 문제 해결 -> 현재 위치를기준으로 상/하/좌/우 를 이동 후 이때 ++
 */

class Solution{
    public int[][] solution(int n){
        int [][] answer = new int[n][n];
        int direction = 0; // 이동방향 -> 0 : 오른쪽 , 1 : 아래 , 2: 왼쪽, 3: 위
        int value = 1; // 채워야할 정수값
        int row = 0; // 현재 행
        int col = 0; // 현재 열

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



//        while (value <= (n*n)){
//            answer[row][col] = value++;
//
//            // 오른쪽 방향
//            if(direction == 0){
//                if(col == n - 1 || answer[row][col + 1] != 0){
//                    direction = 1;
//                    row ++; // 아래로 이동
//                }
//                else {
//                    col ++; // 오른쪽으로 이동
//                }
//            }
//
//            // 아래 방향
//            else if(direction == 1){
//                if(row == n - 1 || answer[row + 1][col] != 0){
//                    direction = 2;
//                    col --; //왼쪽으로이동
//                }
//                else {
//                    row ++; // 아래로 이동
//                }
//            }
//
//            // 왼쪽 방향
//            else if(direction == 2){
//                if(col == 0 || answer[row][col - 1] != 0){
//                    direction = 3;
//                    row --; // 위로 이동
//                }
//                else {
//                    col --; // 왼쪽으로 이동
//                }
//            }
//
//            // 위 방향
//            else if (direction == 3){
//                if(row == 0 || answer[row - 1][col] != 0){
//                    direction = 0;
//                    col ++; // 오른쪽 이동
//                }
//                else{
//                    row --; // 위로 이동
//                }
//            }
//        }



        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

        return answer;
    }
}