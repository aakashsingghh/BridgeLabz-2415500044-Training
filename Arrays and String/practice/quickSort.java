package practice;

public class quickSort {
    public static void main(String [] args){
        int arr[] ={12, 6, 8, 7, 3};
        int newarr[]=new int[5];
        int e=0;
        int o=1;

        for(int i=0;i<5;i++){
            if(arr[i]%2==0){
                newarr[e]=arr[i];
                e+=2;

            }
            else{
                newarr[o]=arr[i];
                o+=2;
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(newarr[i]);
        }
    }
}
