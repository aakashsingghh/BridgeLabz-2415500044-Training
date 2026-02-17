package practice;

import java.util.Arrays;
import java.util.TreeSet;

public class NumbersDisap {
    public static void main(String[] args){
        int arr[]={4,3,2,7,8,2,3,1};
        int sum=0;
        TreeSet<Integer> set=new TreeSet<>();
        for (int x : arr) {
            set.add(x);
        }
        for(int i=1;i<arr.length;i++){

        }
        System.out.println(set);
        System.out.println(sum);
    }
}
