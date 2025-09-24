package Programmers.Level.One.문자열내림차순으로배치하기;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
    public static String solution(String s){
        StringBuilder answer = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j < s.length(); j++ ){
                if(answer.charAt(i) < answer.charAt(j)){
                    char temp = answer.charAt(i);
                    answer.setCharAt(i, answer.charAt(j));
                    answer.setCharAt(j, temp);
                }
            }
        }
        return answer.toString();
    }
}