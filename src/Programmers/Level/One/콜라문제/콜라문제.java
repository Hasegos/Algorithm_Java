package Programmers.Level.One.콜라문제;

public class 콜라문제 {

    public static void main(String[] args) {
        solution(2,1,20);
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (true){
            if(n < a){
                break;
            }
            answer += (n / a) * b;
            n = ((n / a) * b)+ (n % a);
        }
        return answer;
    }
}