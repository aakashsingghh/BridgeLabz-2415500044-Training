import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        String str = String.valueOf(num);
        int n = str.length();
        int[] digits = new int[n];

        for(int i=0;i<n;i++) {
            digits[i] = str.charAt(i) - '0';
        }

        System.out.print("Reversed: ");
        for(int i=n-1;i>=0;i--) {
            System.out.print(digits[i]);
        sc.close();
        }
    }
}
