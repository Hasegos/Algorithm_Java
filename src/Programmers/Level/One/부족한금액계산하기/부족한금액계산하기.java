package Programmers.Level.One.부족한금액계산하기;

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        System.out.println(solution(1,200,1));
    }
    public static long solution(int price, int money, int count){
        long answer = money;
        int i = 1;
        while (true){
            answer -=((long) price * i);
            if(count == i){
                if(answer >= 0){
                    answer = 0;
                    break;
                }
                else {
                    answer *= -1;
                    break;
                }
            }
            i += 1;
        }
        return answer;
    }
}