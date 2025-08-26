import java.util.Scanner;
class SumNaturalCompareWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int formula = n * (n + 1) / 2;
            int sum = 0, i = 1;
            while (i <= n) { sum += i; i++; }
            System.out.println("Formula result = " + formula);
            System.out.println("While loop result = " + sum);
            System.out.println("Both are equal? " + (formula == sum));
        } else {
            System.out.println("Not a natural number");
        }
    }
}
