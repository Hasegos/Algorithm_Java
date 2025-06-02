package Solved.Level.Bronze3.윷놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윷놀이 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;

        /* ––––– 입력이 없을때까지 반복 ––––– */
        while((s = bf.readLine()) != null){
            int count = 0;

            /* ––––– 등이 나왔을때 개수를 체크 ––––– */
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1'){
                    count ++;
                }
            }
            /* ––––– 등의 개수에 따라서 출력 ––––– */
            switch (count){
                case 1:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("E");
                    break;
                default:
                    System.out.println("D");
                    break;
            }
        }
    }
}