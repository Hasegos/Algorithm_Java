package Solved.Class.Class3.Silver.나는야포켓몬마스터이다솜;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 나는야포켓몬마스터이다솜 {

    public static void main(String[] args) throws IOException {
        /* ––––– 사용자로부터 입력부분 ––––– */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int N = Integer.parseInt(s[0]); // 주어진 문제의 개수
        int M = Integer.parseInt(s[1]); // 맞춰야하는 개수        
        
        Map<Integer,String> pokemonNameMap = new HashMap<>(); // 숫자를 입력받았을시
        Map<String, Integer> numberMap = new HashMap<>(); // 문자로 입력받았을시
        for(int i = 0; i < N; i++){
            String pokemonName = bf.readLine();
            pokemonNameMap.put(i,pokemonName);
            numberMap.put(pokemonName, i);
        }

        /* ––––– 입력받은 두 값을 비교해서 숫자 -> 영문 , 영문 -> 숫자 출력 ––––– */
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String checkPokemonName = bf.readLine();
            boolean isNumber = checkPokemonName.matches("[-+]?\\d*\\.?\\d+"); // 숫자인지 문자인지 판별
            if(isNumber){
                sb.append(pokemonNameMap.get(Integer.parseInt(checkPokemonName) - 1)).append("\n");
            }else{
                sb.append(numberMap.get(checkPokemonName) + 1).append("\n");
            }
        }
        System.out.println(sb);
    }
}