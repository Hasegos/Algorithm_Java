package 정렬에대한이야기.QuickSort;

import java.util.Scanner;

public class 수정렬하기3_퀵정렬_왼쪽 {

    public static int partition(int arr[], int left, int right){

        int lo = left; // 왼쪽
        int hi = right; // 오른쪽

        int pivot = arr[left]; // 왼쪽 기준 피벗정렬

        while (lo < hi){

            /*
             * ======================================
             * hi 위치 값이 피벗 값보다 크면서난 lo가 hi
             * 보다 작을 때 hi를 감소시킨다.
             * ======================================
             */

            while (arr[hi] > pivot && lo < hi){
                hi--;
            }

            /*
             * ======================================
             * lo 위치 값이 피벗 값보다 작거나같으면서 lo가 hi
             * 보다 작을 때 lo를 증가시킨다.
             * ======================================
             */

            while (arr[lo] <= pivot && lo < hi){
                lo++;
            }

            /*
             * ======================================
             * 이후에 수를 바꿔준다.
             * ======================================
             */
            swap(arr, lo, hi);
        }

        /*
         * ======================================
         * 피벗 값과 기준점이 된 위치에있는 값과 변경을 한다.
         * ======================================
         */
        swap(arr, left, lo);
        return lo;
    }
    public static void pivot_sort(int arr[], int lo, int hi){
        if(lo >= hi){
            return;
        }

        int pivot = partition(arr,lo,hi);

        pivot_sort(arr, lo, pivot - 1);
        pivot_sort(arr,pivot + 1, hi);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[10000000];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr,N - 1);

        for(int i = 0; i < N; i++){
            System.out.println(arr[i]);
        }
    }

    // 스왑하기
    public static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int arr[],int N){
        pivot_sort(arr,0,N);
    }
}