package practice;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4, 5, 0, 3, 0, 6, 7, 9};
//        for (int i = 0; i < arr.length; i++) {
//            int temp = 0;
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for(int j=0;j< arr.length;j++){
//            System.out.print(arr[j]+" ");
//        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++) {
                if (arr[j] == 0) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }

}
