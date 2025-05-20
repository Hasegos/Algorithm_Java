package Solved.Class.Class2.Silver.팩토리얼0의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼0의개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()), two = 0, five = 0;
        for(int i = N; i > 0; i--){
            int temp = i;
            while (true){
                // 2와 5를 가진 수인지 확인
                if(temp % 2 == 0){
                    two++;
                    temp /= 2;
                }
                if(temp % 5 == 0){
                    five ++;
                    temp /= 5;
                }
                // 만약 없다면 
                if(temp % 2 != 0 ||  temp % 5 != 0){
                    // 한번더 확인
                    if(temp % 5 == 0){
                        five++;
                        temp/=5;
                        continue;
                    }
                    else if(temp % 2 == 0){
                        two++;
                        temp /= 2;
                        continue;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        if(two > five){
            System.out.println(five);
        }
        else{
            System.out.println(two);
        }
    }
}