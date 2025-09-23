package Programmers.Level.One.콜라츠추측;

public class 콜라츠추측 {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }
    public static int solution(int num){
        int answer = 0;
        if(num == 1){
            return 0;
        }
        long n = num;
        while (n != 1){
            if(answer >= 500){
                return -1;
            }
            if(n % 2 == 0){
                n = n / 2;
            }
            else{
                n = (n * 3) + 1;
            }
            answer++;
        }
        return answer;
    }
}