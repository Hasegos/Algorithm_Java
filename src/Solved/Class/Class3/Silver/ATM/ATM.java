package Solved.Class.Class3.Silver.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ATM {

    public static void main(String[] args) throws IOException {

        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");

        /* ––––– 입력받은 내용 sort (오름차순) ––––– */
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length; i++){
            list.add(Integer.parseInt(s[i]));
        }
        Collections.sort(list);

        /* ––––– 오름차순된걸로 더하기 ––––– */
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            result += (list.get(i) *(N - i));
        }
        sb.append(result);
        System.out.println(sb);
    }
}