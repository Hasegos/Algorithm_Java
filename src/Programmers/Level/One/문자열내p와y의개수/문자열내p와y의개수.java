package Programmers.Level.One.문자열내p와y의개수;

public class 문자열내p와y의개수 {

    public static void main(String[] args) {
        System.out.println(solution("Pyy"));
    }

    public static boolean solution(String s){
        int length = s.length();
        int count = 0;

        for(int i = 0; i < length; i++){
            if(s.charAt(i) == 'Y' || s.charAt(i) == 'y' ){
                count ++;
            }
            if(s.charAt(i) == 'P' || s.charAt(i) == 'p'){
                count --;
            }
        }
        return (count == 0) ? true : false;
    }
}