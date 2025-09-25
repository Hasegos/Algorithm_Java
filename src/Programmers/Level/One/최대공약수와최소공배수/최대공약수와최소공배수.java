package Programmers.Level.One.최대공약수와최소공배수;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        solution(3,12);
    }
    public static int[] solution(int n, int m){
        int[] answer = {};

        int max = Math.max(n,m); // a
        int min = Math.min(n,m); // b
        int sum =  max * min;

        // 유클리드 호제법 (gcd -> 최소공배수 / lcd -> 최소공약수)
        // 두 수 a와 b로 두고 a가 0이 될때까지 b로 나눌 경우 b는 최소공약수가 된다.
        // 최소 공배수 : a * b / 최소 공약수
        while (min != 0){
           int r = min;
           min = max % min;
           max = r;
        }
        answer = new int[]{max, sum / max};
        return answer;
    }
}