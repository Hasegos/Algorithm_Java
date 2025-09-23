package Programmers.Level.One.음양더하기;

public class 음양더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }
    public static int solution(int[] absolutes, boolean[] signs){
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return answer;
    }
}