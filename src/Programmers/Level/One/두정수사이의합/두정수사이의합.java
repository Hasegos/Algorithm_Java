package Programmers.Level.One.두정수사이의합;

public class 두정수사이의합 {

    public static void main(String[] args) {
        System.out.println(solution(-5,3));
    }

    public static long solution(int a, int b){
        long max = Math.max(a,b);
        long min = Math.min(a,b);
        return (max - min + 1) * (max + min)  / 2;
    }
}