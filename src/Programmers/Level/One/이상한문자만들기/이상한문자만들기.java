package Programmers.Level.One.이상한문자만들기;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        solution("  try hello world   ");
    }

    public static String solution(String s) {
        String[] a = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();
        int count = 0;
        for(String i : a){
            count ++;
            for(int j = 0; j < i.length(); j++){
                if(j % 2 == 0){
                    answer.append(Character.toUpperCase(i.charAt(j)));
                }
                else{
                    answer.append(Character.toLowerCase(i.charAt(j)));
                }
            }
            if(count < a.length){
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}