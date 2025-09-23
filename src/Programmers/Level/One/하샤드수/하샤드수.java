package Programmers.Level.One.하샤드수;

public class 하샤드수 {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }
    public static boolean solution(int x){
        boolean answer = false;
        int sum = 0, temp = x;
        while (x > 0){
            sum += (x % 10);
            x /= 10;
        }
        if(temp % sum == 0){
            answer = true;
        }
        return answer;
    }
}