package Programmers.Level.One.서울에서김서방찾기;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }
    public static String solution(String[] seoul){
        String answer = "";
        int count = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                count = i;
            }
        }
        answer = "김서방은 " + count + "에 있다";

        // 아래와같이 위치를 찾을 수 있다.
        int x = Arrays.asList(seoul).indexOf("Kim");

        return answer;
    }
}