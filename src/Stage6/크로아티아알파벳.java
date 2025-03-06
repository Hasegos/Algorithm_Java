package Stage6;

import java.util.Scanner;

public class 크로아티아알파벳 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Alphabet = sc.nextLine();
        sc.close();

        int count = 0;
        int len = Alphabet.length();
        int i = 0;
        // else 도달 시간 너무걸림, 다음 배열에 참조할수있는 조건식 필요
        while (i < len) {
            if (i + 1 < len) { // 해당 번째 +1를 했을 때 문자열 길이보다 작아야함
                if (Alphabet.charAt(i) == 'c') {
                    if (Alphabet.charAt(i + 1) == '-') {
                        i += 1;
                    } else if (Alphabet.charAt(i + 1) == '=') {
                        i += 1;
                    }
                }
                else if (Alphabet.charAt(i) == 'd') {
                    if (Alphabet.charAt(i + 1) == 'z') {
                        if(i + 2 < len) { // 특정하게 +2를 하는 구간만 설정
                            if (Alphabet.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    }
                    else if (Alphabet.charAt(i + 1) == '-') {
                        i += 1;
                    }
                }
                else if (Alphabet.charAt(i) == 'l') {
                    if (Alphabet.charAt(i + 1) == 'j') {
                        i += 1;
                    }
                }
                else if (Alphabet.charAt(i) == 'n') {
                    if (Alphabet.charAt(i + 1) == 'j') {
                        i += 1;
                    }
                }
                else if (Alphabet.charAt(i) == 's') {
                    if (Alphabet.charAt(i + 1) == '=') {
                        i += 1;
                    }
                }
                else if (Alphabet.charAt(i) == 'z') {
                    if (Alphabet.charAt(i + 1) == '=') {
                        i += 1;
                    }
                }
            }
            i++;
            count++;
        }
        System.out.println(count);
    }
}
