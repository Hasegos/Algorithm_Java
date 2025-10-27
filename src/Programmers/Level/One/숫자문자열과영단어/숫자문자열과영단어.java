package Programmers.Level.One.숫자문자열과영단어;

import java.util.HashMap;
import java.util.Map;

public class 숫자문자열과영단어 {

    public static void main(String[] args) {
        solution("23four5six7");
        solution2("23four5six7");
    }

    public static int solution(String s){
        String answer = "";
        String n = "";

        Map<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);

        for(int i = 0; i < s.length(); i++){

            n = "";
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                answer += s.charAt(i);
                continue;
            }

            if(i + 3 > s.length()){
                break;
            }

            for(int j = i; j < i + 3; j++ ){
                n += s.charAt(j);
            }

            if(map.containsKey(n)){
                answer += map.get(n);
                i += 2;
                continue;
            }

            n+= s.charAt(i + 3);
            if (map.containsKey(n)){
                answer += map.get(n);
                i += 3;
                continue;
            }

            n+= s.charAt(i + 4);
            if (map.containsKey(n)){
                answer += map.get(n);
                i += 4;
            }
        }
        return Integer.parseInt(answer);
    }

    public static int solution2(String s){
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i =0; i < arr.length; i++){
            s = s.replaceAll(arr[i], Integer.toString(i));
        }

        System.out.println(s);
        return Integer.parseInt(s);
    }
}