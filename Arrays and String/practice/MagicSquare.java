
package practice;
import java.util.*;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args){

    int arr[][]= {{2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
    };
    int n=3;
    int d1=0;
    int d2=0;
    for(int i=0;i< n;i++){
        d1+=arr[i][i];
        d2+=arr[i][n-1-i];
    }
    if(d1!=d2){
        System.out.println("Diagonal sum not equal");
    }
    int row=0;
    int col=0;
    for (int i=0;i<n;i++){
        row+=arr[0][i];
    }
    for(int i=1;i<n;i++){
        int refrow=0;
        for(int j=0;j<n;j++){
            refrow+=arr[i][j];
        }
        if(refrow!=row){
            System.out.println("Row Sum Not Equal");
        }
    }
    int k=0;
    for(int j=0;j<n;j++){
        col+=arr[j][0];
    }
    for(int j=1;j<n;j++) {
        int refcol = 0;
        for (int i = 0; i < n; i++) {
            refcol += arr[j][i];
        }
        if (refcol != col) {
            System.out.println("COL Sum not equal");
        }


    }


    }
}
