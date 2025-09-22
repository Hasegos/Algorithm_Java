package Programmers.Level.One.정수내림차순으로배치하기;

public class 정수내림차순으로배치하기 {

    public static void main(String[] args) {
        solution(118372);
    }

    public static long solution(long n){
        String str = String.valueOf(n);
        int length = str.length() ;
        int[] arr = new int[length];
        long answer = 0;

        for(int i = 0; i < length; i++){
            arr[i] = str.charAt(i) - '0';
        }

        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < length; i++){
            answer += (long) (arr[i] * Math.pow(10, length - i - 1));
        }
        return answer;
    }
}