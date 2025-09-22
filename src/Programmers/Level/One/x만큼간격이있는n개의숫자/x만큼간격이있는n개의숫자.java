package Programmers.Level.One.x만큼간격이있는n개의숫자;

import java.util.stream.LongStream;

public class x만큼간격이있는n개의숫자 {

    public static void main(String[] args) {
        int x = 2, n = 5;
        solution(x, n);
    }

    public static long[] solution(int x, int n) {
        long[] answer = LongStream.iterate(x, k -> k + x).limit(n).toArray();
        return answer;
    }
}