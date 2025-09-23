package Programmers.Level.One.정수제곱근판별;

public class 정수제곱근판별 {

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
    // n = 1 인 경우때문에 +1 범위
    public static long solution(long n){
        long answer = -1;
        for(int i = 1; i <= (n / 2) + 1; i++){
            if(Math.pow(i, 2) == n){
                answer = (long) Math.pow(i + 1, 2);
                break;
            }
        }
        return answer;
    }
}