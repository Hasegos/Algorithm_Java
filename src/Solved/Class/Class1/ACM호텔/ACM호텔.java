package Solved.Class.Class1.ACM호텔;

import java.util.Scanner;

public class ACM호텔 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(),H,W,N;
        for(int i = 0; i < T; i ++){
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();

            // 해당 층의 꼭대기인 친구들
            if(N % H == 0){
                System.out.println((H * 100)  + (N / H));
            }
            else{
                System.out.println(((N % H) * 100)  + ((N / H) + 1));
            }
        }
    }
}