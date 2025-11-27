package Stage6.그룹단어체커;

import java.util.Scanner;

public class BOJ_1316_그룹단어체커 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N개의 단어
        sc.nextLine();
        int count = 0;
        int num = 0;
        for(int i = 0; i < N; i++){
            String arr = sc.nextLine();
            if(arr.length() == 1){
                count++;
                continue;
            }
            // 문자열 길이만큼 반복
            for(int j = 0;  j < arr.length(); j++){
                for(int k = j + 1; k < arr.length(); k++){
                    if(arr.charAt(j) == arr.charAt(k)){ // (같은게 하나라도 있을때)
                        if(j + 1 == k){// 연속을의미
                              j++;
                        }
                        else { // 연속 X
                            num = -1;
                        }
                    }
                    else { // 같은게 하나도 없을 때 (혼자)
                        
                    }
                }
            }
            if(num == 0) {
                count++;
            }
            num = 0;
        }
        System.out.println(count);
    }
}
