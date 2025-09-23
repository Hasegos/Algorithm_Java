package Programmers.Level.One.나누어떨어지는숫자배열;


public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        solution(new int[]{3, 2, 6}, 10);
    }
    public static int[] solution(int[] arr, int divisor){
        int[] answer = {};
        int count = 0, temp = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
               count++;
            }
        }
        if(count == 0){
            answer = new int[]{-1};
            return answer;
        }
        answer = new int[count];
        count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[count] = arr[i];
                count++;
            }
        }
        for(int i = 0; i < answer.length; i++){
            for(int j = i + 1; j < answer.length; j++){
                if(answer[i] > answer[j]){
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}