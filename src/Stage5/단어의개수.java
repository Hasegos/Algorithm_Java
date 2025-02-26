package Stage5;

import java.util.Scanner;

public class 단어의개수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        if(s.charAt(0) == ' '){
            count--;
        }
        if(s.charAt(s.length() - 1) == ' '){
            count--;
        }
        System.out.println(count);
    }
}
