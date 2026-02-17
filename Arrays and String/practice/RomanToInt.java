package practice;

import java.util.Scanner;



class RomanToInt{
    public static void main(String [] args){
        String s="LIX";
        String roman="IVXLCDM";
        int [ ] val={1,5,10,50,100,500,1000};
        int total=0;
        for(int i=0;i<s.length();i++){
            int curr=val[roman.indexOf(s.charAt(i))];

            if (i < s.length() - 1) {
                int next = val[roman.indexOf(s.charAt(i + 1))];
                if (curr < next) {
                    total -= curr;
                    continue;
                }
            }
            total+=curr;
        }
        System.out.println(total);
    }

}