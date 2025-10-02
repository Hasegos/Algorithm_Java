package Programmers.Level.One.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        solution(new int[]{5,0,2,7});
    }

    public static int[] solution(int[] numbers){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                list.add(numbers[i]+ numbers[j]);
            }
        }
        int[] answer = list.stream().distinct().mapToInt(Integer :: intValue).toArray();
        answer = Arrays.stream(answer).sorted().toArray();

        return answer;
    }
}