package Stage6;

import java.util.Scanner;

/* 문제 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
단, 대문자와 소문자를 구분하지 않는다. */

/* 입력 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다. */

/*출력 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다. */

/*
예제 입력 1 : Mississipi
예제 출력 1 : ?
*/

// 비교 자체가 비효율적일때가 있다.

public class 단어공부 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        int  Max = -1 ,  same = 0, I = 0;
        String Alphabet = sc.nextLine();
        int length = Alphabet.length(); // 문자열 길이
        sc.close();

        Alphabet = Alphabet.toUpperCase(); // 올 대문자 만들기

        // 한글자 일때
        if(length == 1){
            System.out.println(Alphabet);
        }
        else{
            // 두글자 이상 비교 자체가 비효율적
            for(int i = 0; i < length; i++){
                arr[Alphabet.charAt(i) - 65] ++;
            }
            for(int i = 0; i < 26; i++){
                if(Max < arr[i]){
                    Max = arr[i];
                    I = i;
                    continue;
                }
                if(Max == arr[i]){
                    same = Max;
                }
            }
            if(Max == same){
                System.out.println("?");
            }
            else{
                System.out.println((char)(I + 65));
            }
        }
    }
}
