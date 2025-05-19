package Solved.Class.Class2.영화감독숌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독숌 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int num = 666;
        int count = 1;

        // 브루트포스 알괴리즘
        while (true){
            if(count == N){
                break;
            }
            num ++;
            if(String.valueOf(num).contains("666")){
                count ++;
            }
        }
        System.out.println(num);

        /* 각 구역별 나눈 방식 */
        func(N);
    }

    /* 각 구역별 나눈 방식 */
    public static void func(int N){
        int count = 1; // 횟수
        int num = 0; // 뒷자리
        int pre_digit = 0; // 선수자리

        while (true){

            /* 선수자리 : 666x 이면서 6666 이아닌 수
            * ex) 6660_000 , 6660_001
            * */
            if((pre_digit % 10000) / 10 == 666 && pre_digit % 10 != 6){
                for(int i = 0; i < 1000; i++){
                  if(count == N){
                      System.out.println(pre_digit * 1000 + num);
                      return;
                  }
                  count++;
                  num++;
                }
                pre_digit++;
            }

            /* 선수자리 : 666 일때
            * ex) x...666  666_000, 1666_000
            * */
            else if(pre_digit % 1000 == 666){
                num = 0;
                for(int i =0; i < 1000; i++){
                    if(count == N){
                        System.out.println(pre_digit * 1000 + num);
                        return;
                    }
                    count++;
                    num++;
                }
                pre_digit++;
            }

            /* 선수자리 : x66 일때
            * ex) 66_600 , 166_600, ...
            * */
            else if(pre_digit % 100 == 66){
                num = 600;
                for(int i = 0; i < 100; i++){
                    if(count == N){
                        System.out.println(pre_digit * 1000 + num);
                        return;
                    }
                    count++;
                    num++;
                }
                pre_digit++;
            }

            /* 선수자리 : xx6 일때
            *  ex) 6_660, 16_660
            * */
            else if(pre_digit % 10 == 6){
                num = 660;
                for(int i = 0; i < 10; i++){
                    if(count == N){
                        System.out.println(pre_digit * 1000 + num);
                        return;
                    }
                    count++;
                    num++;
                }
                pre_digit++;
            }
            /* 선수자리 : 6 이 없는 나머지
            *  ex) 111_666, 123_666
            * */
            else {
                num = 666;
                if(count == N){
                    System.out.println(pre_digit * 1000 + num);
                    return;
                }
                count++;
                pre_digit++;
            }
        }
    }
}