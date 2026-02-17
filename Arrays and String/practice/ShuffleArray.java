package practice;

public class ShuffleArray {
    public static void main(String [] args){
        int arr[]={1,2,3,4,5,6};
        //[0]1  [1]4  [2]2  [3]5  [4]3  [5]6
        int ne[]=new int[arr.length];
        int n=arr.length/2;

        int even=0;
        int odd=1;

        for(int i=0;i<n;i++){
            ne[even] = arr[i];
            even += 2;
        }

        for (int i = n; i < arr.length; i++) {
            ne[odd] = arr[i];
            odd += 2;
        }

//        int index =0;
//        for(int i = 0 ; i < n ; i++){
//            ne[index] = arr[i];
//            index++;
//            ne[index]=arr[i+n];
//            index++;
//        }


        for(int i=0;i<arr.length;i++){
            System.out.println(ne[i]);
        }

    }
}
