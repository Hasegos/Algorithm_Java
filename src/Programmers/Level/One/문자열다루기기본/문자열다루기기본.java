package Programmers.Level.One.문자열다루기기본;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        System.out.println(solution("   1  "));
    }
    public static boolean solution(String s){
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) - 'A' >= 0){
                    answer = false;
                }
            }
        }
        else{
            answer =  false;
        }
        return answer;
    }
}