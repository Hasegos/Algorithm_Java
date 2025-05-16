package Solved.Class.Class2.수정렬이야기;

import java.util.Scanner;

public class 수정렬하기3_퀵정렬_가운데 {

    public static int pivot(int arr[], int left, int right){
        int lo = left - 1;
        int hi = right + 1;
        int pivot = arr[(left + right) / 2];

        while (true){
            /*
            * ======================================
            * 1 을 증가시키고 난 뒤에 lo 위치의 요소가
            *  pivot 보다 큰 요소를 찾을 때까지 반복
            * ======================================
            */

            do {
                lo++;
            }while (arr[lo] < pivot);

            /*
             * ======================================
             * 1 을 감소시키고 난 뒤에 hi 위치의 요소가
             *  pivot 보다 작은 요소를 찾을 때까지 반복
             * ======================================
             */

            do {
                hi--;
            } while (arr[hi] > pivot && hi >= lo);

            if(lo >= hi){
                return hi;
            }
            swap(arr,lo,hi);
        }
    }

    public static void pivot_sort(int arr[], int lo, int hi){
        if(lo >= hi){
            return;
        }

        /*
         * ======================================
         * 피벗을 기준으로 요소들의 왼쪽과 오른쪽으로 약하게 정렬된 상태로
         * 만들어 준 뒤, 최종적으로 pivot 의 위치를 얻는다.
         * ======================================
         *
         *
         * 그러고나서 해당 피벗을 기준으로 왼쪽 부분리스트와 오른쪽 부분리스트로 나누어
         * 분할 정복해준다.
         */

        int pivot = pivot(arr, lo, hi);

        pivot_sort(arr, lo, pivot);
        pivot_sort(arr, pivot + 1, hi);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10000000];
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,N-1);
        for (int i = 0; i < N; i++){
            System.out.println(arr[i]);
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int arr[], int N){
        pivot_sort(arr, 0, N);
    }
}