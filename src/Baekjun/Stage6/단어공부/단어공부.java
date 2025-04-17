package Stage6.단어공부;

import java.util.Scanner;

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
