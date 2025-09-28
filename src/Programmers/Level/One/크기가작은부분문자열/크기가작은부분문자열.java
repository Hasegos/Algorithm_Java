package Programmers.Level.One.크기가작은부분문자열;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        solution("3141592", "271");
    }
    public static int solution(String t, String p){
        int answer = 0;
        int pLength = p.length();
        long pLong = Long.parseLong(p);
        for(int i = 0; i <= t.length() - pLength; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < pLength + i; j++){
               sb.append(t.charAt(j));
            }
            if(Long.parseLong(String.valueOf(sb)) <= pLong){
                answer += 1;
            }
        }
        return answer;
    }
}