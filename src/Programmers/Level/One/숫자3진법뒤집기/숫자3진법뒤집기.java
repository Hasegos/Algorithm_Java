package Programmers.Level.One.숫자3진법뒤집기;

public class 숫자3진법뒤집기 {
    public static void main(String[] args) {
        solution(45);
    }
    public static int solution(int n){
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while (n != 0){
            sb.append(n % 3);
            n /= 3;
        }
        String s = sb.toString();
        // 3의 진수 -> 10진수로 변환
        answer = Integer.parseInt(s,3);
        return answer;
    }
}