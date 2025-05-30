package Solved.Class.Class3.Silver.비밀번호찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 비밀번호찾기 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bf.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        /* ––––– 입력받은 사이트 주소, 비밀번호 Map 으로 저장 ––––– */
        Map<String, String> list = new HashMap<>();
        for(int i = 0; i < N; i++){
            String[] s = bf.readLine().split(" ");
            list.put(s[0], s[1]); // 사이트 주소, 비밀번호
        }

        /* ––––– 입력받은 사이트 주소가 존재하면 비밀번호 출력 ––––– */
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String s2 = bf.readLine();
            if(list.containsKey(s2)){ // 존재한다면
                sb.append(list.get(s2)).append("\n");
            }
        }
        System.out.println(sb);
    }
}