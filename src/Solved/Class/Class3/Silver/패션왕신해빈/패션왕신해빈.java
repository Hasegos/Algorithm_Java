package Solved.Class.Class3.Silver.패션왕신해빈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 패션왕신해빈 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++){
            /* ––––– 중복 허용 X ––––– */
            Map<String, Integer> map = new HashMap<>();
            int a = Integer.parseInt(bf.readLine());
            int result = 1;

            for(int j = 0; j < a; j++){
                String s = bf.readLine();
                String [] split = s.split(" ");
                /* ––––– 키 : 종류 값 : 종류의 개수 ––––– */
                if(map.containsKey(split[1])) {
                    map.put(split[1],map.get(split[1]) + 1);
                }
                /* ––––– 만약없으면 1 생성 ––––– */
                else{
                    map.put(split[1],1);
                }
            }
            /* ––––– 결과값 ––––– */
            /*
            * 우리가 구해야할건 각 경우의 수 + (각각의 종류수 * 종류수 이면서 중복 허용 X)이다.
            * 그럼으로 (각 경우의 수를 곱해준뒤 -1)를 해주면 해당 경위의 수가나온다.
            * */

            for(int b : map.values()){
                result *= (b + 1);
            }
            sb.append(result - 1).append("\n");
        }
        System.out.println(sb);
    }
}