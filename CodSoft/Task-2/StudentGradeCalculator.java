import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter No. of Subjects :");
        int NS = sc.nextInt();
        int Total = 0;
        for (int i = 1; i <= NS; i++) {
            System.out.println("Enter Marks obtained in " + i + " Subject:");
            int Marks = sc.nextInt();
            Total += Marks;
        }
        double averP = (double) Total / NS;
        char Grade;
        if (averP >= 90) {
            Grade = 'O';
        } else if (averP >= 80) {
            Grade = 'A';
        } else if (averP >= 70) {
            Grade = 'B';
        } else if (averP >= 60) {
            Grade = 'C';
        } else if (averP >= 50) {
            Grade = 'D';
        } else if (averP >= 40) {
            Grade = 'E';
        } else {
            Grade = 'F';
        }
        System.out.println("Total Marks Scored is " + Total);
        System.out.println("Average Percentage Gained is " + averP + "%");
        System.out.println("Grade : " + Grade);
    }
}