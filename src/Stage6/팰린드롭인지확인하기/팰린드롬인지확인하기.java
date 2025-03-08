package Stage6.팰린드롭인지확인하기;

import java.util.Scanner;

public class 팰린드롬인지확인하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String Alphabet = sc.nextLine();
        for(int i = 0; i < Alphabet.length() / 2; i++){
            if(Alphabet.charAt(i) != Alphabet.charAt((Alphabet.length() - 1) -  i)){
                count ++;
            }
        }
        if(count == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
