package practice;

public class PowN {
    public static void main(String[] args) {
        int n=-2;
        double x=2.00000;
        double r=1.000;
        if(n>0) {
            for (int i = 0; i < n; i++) {
                r = r * x;
            }
        }
        else{
            n=n/-1;
            for(int i=0;i<n;i++){
                r=r/x;
            }
        }
        System.out.println(r);
    }
}
