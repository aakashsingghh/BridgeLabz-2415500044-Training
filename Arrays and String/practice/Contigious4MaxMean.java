package practice;

public class Contigious4MaxMean {
    public static void main(String[] args){
        int arr[]={1,14,16,18,20,3};
        int currsum=0;
        for(int i=0;i<4;i++){
            currsum+=arr[i];
        }
        int maxsum=currsum;
        for(int i=4;i<arr.length;i++){
            currsum=currsum+arr[i]-arr[i-4];
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        System.out.println(maxsum/4.0);

    }
}
