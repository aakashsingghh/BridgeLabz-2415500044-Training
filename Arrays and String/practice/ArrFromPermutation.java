package practice;

public class ArrFromPermutation {
    public static void main(String[] args){
        int arr[]={0,2,1,5,3,4};
        // [0]0  [1]1. [2]2  [3]4  [4]5  [5]3
        int n=arr.length;
        int newarr[]=new int[n];
        for(int i=0;i<n;i++){
            newarr[i]=arr[arr[i]];
        }
        for(int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }

//        for(int i=0;i<n;i++){
//            newarr[arr[i]]=arr[i];
//        }
    }
}
