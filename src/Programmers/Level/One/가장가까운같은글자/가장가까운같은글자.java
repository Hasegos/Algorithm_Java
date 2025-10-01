package Programmers.Level.One.가장가까운같은글자;

public class 가장가까운같은글자 {

    public static void main(String[] args) {
        solution("foobar");
    }

    public static int[] solution(String s){
        int[] answer = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            answer[i] = -1;
        }
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    answer[j] = j - i;
                }
            }
        }
        return answer;
    }
}