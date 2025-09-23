package Programmers.Level.One.가운데글자가져오기;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("b"));
    }
    public static String solution(String s){
        StringBuilder answer = new StringBuilder();

        if(s.length() == 1){
            return s.charAt(0) + "";
        }
        if(s.length() % 2 == 0){
            answer.append(s.charAt(s.length() / 2 - 1));
            answer.append(s.charAt(s.length() / 2));
        }else{
            answer.append(s.charAt(s.length() / 2));
        }

        return answer.toString();
   }
}