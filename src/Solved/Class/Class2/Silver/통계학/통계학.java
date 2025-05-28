package Solved.Class.Class2.Silver.통계학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class 통계학 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        int[] arr = new int[N];
        int[] freq = new int[8001];
        LinkedList<Integer> models = new LinkedList<>();

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            freq[4000 + arr[i]] ++;
            result += arr[i];
        }
        Arrays.sort(arr);

        int maxCount = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > maxCount){ // 빈도가 더큰값을 만날때
                maxCount = freq[i];
                models.clear();
                models.add(i - 4000);
            }
            else if(maxCount == freq[i]){ //만약 빈도가 똑같을 경우 추가
                models.add(i - 4000); 
            }
        }
        Collections.sort(models);

        System.out.println((int)Math.round((double) result / N)); // 산술평균
        System.out.println(arr[N / 2]); // 중앙값
        System.out.println(models.size() > 1 ? models.get(1) : models.get(0) );
        System.out.println(arr[N - 1]- arr[0]); // 최댓값과 최솟값의 차이
    }
}