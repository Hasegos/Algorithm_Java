package Programmers.Level.One.문자열을정수로바꾸기;

public class 문자열을정수로바꾸기 {

    public static void main(String[] args) {
        String s = "-1234";
        solution(s);
    }

    public static int solution(String s){
        int answer = 0;

        if(s.charAt(0) == '-'){
            answer = Integer.parseInt(s.substring(1));
            answer *= -1;
        }
        else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}