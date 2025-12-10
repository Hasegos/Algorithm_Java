package Baekjun.단계별로풀어보기.Step19_재귀.BOJ_24060_알고리즘수업_병합정렬1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24060_알고리즘수업_병합정렬1 {

    static int[] temp;
    static int count = 0, checkNumber = 0, number;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = bf.readLine().split(" ");
        int[] arr = new int[Integer.parseInt(s[0])];
        String[] stringArr = bf.readLine().split(" ");

        temp  = new int[arr.length];
        number = Integer.parseInt(s[1]);

        for(int i = 0; i < Integer.parseInt(s[0]); i++){
            arr[i] = Integer.parseInt(stringArr[i]);
        }

        sort(arr,0 , Integer.parseInt(s[0]) - 1);
        if(number > count){
            sb.append(-1).append("\n");
        }
        else{
            sb.append(checkNumber).append("\n");
        }
        System.out.println(sb);
    }

    public static void sort(int[] arr, int left, int right){
        int mid;
        if(left < right){
            mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, right, mid);
        }
    }

    public static void merge(int[] arr, int left, int right, int mid){
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right){
            if(arr[l] <= arr[r]){
                temp[idx] = arr[l];
                count++;

                if(count == number){
                    checkNumber = arr[l];
                }
                l++;
            }
            else{
                temp[idx] = arr[r];
                count ++;

                if(count == number){
                    checkNumber = arr[r];
                }
                r++;
            }
            idx++;
        }

        while (l <= mid){
            temp[idx] = arr[l];
            count ++;
            if(count == number){
                checkNumber = arr[l];
            }
            idx++;
            l++;
        }

        while (r <= right){
            temp[idx] = arr[r];
            count ++;

            if(count == number){
                checkNumber = arr[r];
            }
            idx++;
            r++;
        }

        for(int i = left; i <= right; i++){
            arr[i] = temp[i];
        }
    }
}