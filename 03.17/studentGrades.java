import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class studentGrades {

    String studentName;
    double[] grades;

    studentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    studentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        Random rand = new Random();
        for (int i=0;i<grades.length;i++) {
            grades[i] = rand.nextInt(5-2)+2;
        }
    }
    studentGrades(String name) {
        this.studentName = name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of grades");
        int numberOfGrades = scanner.nextInt();
        this.grades = new double[numberOfGrades];
        for (int i=0;i<numberOfGrades;i++) {
            System.out.println("Enter a grade");
            this.grades[i] = scanner.nextDouble();
        }
    }
    double lowestGrade() {
        Arrays.sort(grades);
        return grades[0];
    }
    double highestGrade() {
        Arrays.sort(grades);
        return grades[grades.length-1];
    }
    double numberOfGrades() {
        return grades.length;
    }
    double gradesAverage() {
        double sum = 0;
        for (double i : grades) {
            sum += i;
        }
        return sum/numberOfGrades();
    }
    void displayRecord() {
        System.out.println("Name: " + this.studentName);
        System.out.println("Grades: " + Arrays.toString(this.grades));
        System.out.println("Highest grade: " + this.highestGrade());
        System.out.println("Lowest grade: " + this.lowestGrade());
        System.out.println("Average: " + this.gradesAverage());
    }
    public static void main(String[] args) {
        studentGrades Amanda = new studentGrades("Amanda", new double[] {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
        studentGrades James = new studentGrades("James", new double[] {2.0, 3.0, 2.0, 4.5, 4.5});
        Amanda.displayRecord();
        James.displayRecord();
        studentGrades random = new studentGrades("random", 5);
        random.displayRecord();
        studentGrades scanner1 = new studentGrades("scanner1");
        scanner1.displayRecord();
    }
}
