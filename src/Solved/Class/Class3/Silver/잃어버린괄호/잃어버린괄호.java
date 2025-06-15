package Solved.Class.Class3.Silver.잃어버린괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 잃어버린괄호 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] subtraction = bf.readLine().split("-");

        int result = 0; // 총 결과값
        for(int i = 0; i < subtraction.length; i++){
            int temp = 0;

            /*  ––––– "+" 기준으로 짜르기위한 "\+" 정규식 표현 ––––– */
            String[] a = subtraction[i].split("\\+");
            for(int j = 0; j < a.length; j++){
                temp += Integer.parseInt(a[j]);
            }
            /*  ––––– 첫번째 값을 제외한 나머지 값들은 모두 빼기 ––––– */
            if(i == 0) result += temp;
            else result -= temp;
        }
        System.out.println(result);
    }
}