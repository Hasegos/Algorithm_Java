package Programmers.Level.One.시저암호;

public class 시저암호 {

    public static void main(String[] args) {
            solution("a B z",4);
    }

    public static String solution(String s, int n){
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                answer.append(' ');
            }
            else {
                if('a' <= s.charAt(i)){
                    if(s.charAt(i) + n > 'z'){
                        answer.append((char)(s.charAt(i) + n - 26));
                        continue;
                    }
                }
                else{
                    if(s.charAt(i) + n > 'Z'){
                        answer.append((char)(s.charAt(i) + n - 26));
                        continue;
                    }
                }
                answer.append((char)(s.charAt(i) + n));
            }
        }
        return answer.toString();
    }
}