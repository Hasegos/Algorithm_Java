package Programmers.Level.One.푸드파이트대회;

public class 푸드파이트대회 {
    public static void main(String[] args) {
        solution(new int[]{1,3,4,6});
    }

    public static String solution(int[] food){
        String answer = "0";
        for(int i = food.length - 1; i > 0; i--){
            for(int j = 0; j < food[i] / 2; j++){
                answer = i + answer + i;
            }
        }
        return answer.toString();
    }

    public static String solution2(int[] food) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < food.length; i++) {
            if (food[i] < 2) {
                continue;
            } else {
                for (int j = 0; j < food[i] / 2; j++) {
                    answer.append(i);
                }
            }
        }
        answer.append("0");
        for (int i = answer.length() - 2; i >= 0; i--) {
            answer.append(answer.charAt(i));
        }
        return answer.toString();
    }
}