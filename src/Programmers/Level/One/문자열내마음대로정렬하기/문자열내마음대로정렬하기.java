package Programmers.Level.One.문자열내마음대로정렬하기;

import java.util.*;

public class 문자열내마음대로정렬하기 {

    public static void main(String[] args) {
        solution(new String[]{"abce", "abcd", "cdx"},1);
    }

    public static String[] solution(String[] strings, int n){
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n) == o2.charAt(n)){
                    return o1.compareTo(o2);
                }
                return o1.charAt(n) - o2.charAt(n);
            }
        });
        return strings;
    }
}