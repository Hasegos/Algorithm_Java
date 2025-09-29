package Programmers.Level.One.이상한문자만들기;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        solution("try hello world");
    }

    public static String solution(String s) {
        String[] a = s.split("\\s+");
        StringBuilder answer = new StringBuilder();
        for(String i : a){
            for(int j = 0; j < i.length(); j++){
                if(j % 2 == 0){
                    answer.append(Character.toUpperCase(i.charAt(j)));
                }
                else{
                    answer.append(Character.toLowerCase(i.charAt(j)));
                }
            }
           if( < a.length - 1){
               answer.append(" ");
           }
        }

        return answer.toString();
    }
}