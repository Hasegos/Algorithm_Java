package Solved.Class.Class2.단어정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 단어정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        String[] arr = new String[T];

        for(int i=0; i < T; i++){
            arr[i] = bf.readLine();
        }
        // Arrays.sort(배열, new Comparator<타입>()){}
        Arrays.sort(arr, new Comparator<String>() {

            public int compare(String a1, String a2) {
                // 길이가 같을 경우
                if(a1.length() == a2.length()){
                    return a1.compareTo(a2);
                }
                // 길이가 다를 경우
                else{
                 return a1.length() - a2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append("\n");

        for(int i=1; i < T; i++){
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}