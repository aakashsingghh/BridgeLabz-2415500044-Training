import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // phy, chem, math
        double[] percent = new double[n];
        String[] grade = new String[n];

        for(int i=0;i<n;i++) {
            System.out.println("Enter marks in Physics, Chemistry, Maths for student " + (i+1));
            for(int j=0;j<3;j++) marks[i][j] = sc.nextInt();

            percent[i] = (marks[i][0]+marks[i][1]+marks[i][2]) / 3.0;

            if(percent[i] >= 90) grade[i] = "A";
            else if(percent[i] >= 75) grade[i] = "B";
            else if(percent[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        System.out.println("Physics Chemistry Maths % Grade");
        for(int i=0;i<n;i++) {
            System.out.println(marks[i][0]+" "+marks[i][1]+" "+marks[i][2]+" "+percent[i]+" "+grade[i]);
        }
        sc.close();
    }
}
