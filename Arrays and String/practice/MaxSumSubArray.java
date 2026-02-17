package practice;
import java.util.*;
import java.math.*;

import java.util.Scanner;

public class MaxSumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {3,6,7,1,-17,13,5,-20};
        int MaxSum = 0;
        //O(n2)
//        for(int i=0;i< arr.length;i++){
//            int currentSum=0;
//            for(int j=i;j< arr.length;j++){
//                currentSum+=arr[j];
//
//                MaxSum=Math.max(MaxSum,currentSum);
//            }
//        }
//        System.out.println(MaxSum);

        int j=0;
        int res=arr[0];
        int maxEndingHere=arr[0];

        for(int i=1;i< arr.length;i++){
            maxEndingHere=Math.max(arr[i],maxEndingHere+arr[i]);
            res=Math.max(res, maxEndingHere);
//add indexes of array

            }


        System.out.println(res);

    }
}
