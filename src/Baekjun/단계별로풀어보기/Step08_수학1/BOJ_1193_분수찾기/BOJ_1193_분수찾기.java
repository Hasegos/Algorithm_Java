package Stage8.분수찾기;

import java.util.Scanner;

public class BOJ_1193_분수찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 1, i = 1, j = 0; // j는 몇번째인지 찾기
        while (true){
            if(num <= result){
                j = result - i; // 해당 줄에있는 순서 찾기
                break;
            }
            i++; // 몇 줄에있는지
            result += i;

        }
        //홀수 번째
        if(i % 2 != 0){
            // 해당 줄 값 - 해당 번쨰 (1부터 시작함) + 1 (시작점은 항상 해당 줄값이랑 같음)
            System.out.print(i - (num -j) + 1);
            System.out.print("/");
            System.out.print(num - j); 
        }
        // 짝수 번째
        else{
            System.out.print(num - j);
            System.out.print("/");
            System.out.print(i - (num -j) + 1);
        }
    }
}