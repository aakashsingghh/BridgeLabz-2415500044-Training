package practice;

import java.util.Scanner;

public class MergeTwoSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 6, 0, 0, 0, 0};
        int arr2[] = {5, 7, 8, 9};
        int m = arr.length;
        int n = arr2.length;
        ;
//        int c=m+n;
//        int mer[]=new int[n];
//
//        for ( int i=0;i< arr.length;i++){
//            mer[i]=arr[i];
//        }
//        for(int j=0;j< arr2.length;j++){
//            mer[arr.length+j]=arr2[j];
//        }
//        for(int i=0;i<c;i++){
//            System.out.print(mer[i]+" ");
//        }
        int j = n - 1;
        int k = m - 1;
        int i = m + n - 1;

        while (j >= 0 && k >= 0) {
            if (arr[j] > arr2[j]) {
                arr[i] = arr2[k];
                j--;
            }
//            else{
//                int digits1[]=new int[digits.lenght];
//            }
//        }
//        if(digits[digits.length-1]==9){
//
//            digits[digits.length-1]=1;
//            digits[digits.length]=0;
//        }
//        else{
//            digits[digits.length-1]=digits[digits.length-1]+1;
//        }
//        return digits;
        }
    }
}
