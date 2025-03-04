import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        String[] names = new String[numStudents];
        int[][] marks = new int[numStudents][3];

        for(int i=0; i<numStudents; i++) {
            sc.nextLine();
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks in 3 subjects: ");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
            int total = calculateTotal(marks[i]);
            double average = calculateAverage(total, marks[i].length);
            String grade = calculateGrade(average);

            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
            System.out.println("Grade: " + grade + "\n");
        }

        for(String i : names) {
            System.out.println("Student : " + i);
        }

        int highestMarkss = highestMarks(marks, numStudents-1);
        System.out.println("Highest among all marks : " + highestMarkss);

        int originalValue = 50;
        System.out.println("Value before method call: " + originalValue);
        passByValue(originalValue);
        System.out.println("Value after method call: " + originalValue);

    }

    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calculateAverage(int total, int numSubject) {
        return (double) total/ numSubject;
    }

    public static String calculateGrade(double marks) {
        if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else return "F";
    }

    public static int highestMarks(int[][] marks, int studentIndex) {
        if(studentIndex < 0)
            return Integer.MIN_VALUE;

        int highest = Integer.MIN_VALUE;
        for(int mark : marks[studentIndex]) {
            if(mark > highest) {
                highest = mark;
            }
        }
        return Math.max(highest, highestMarks(marks, studentIndex-1));
    }

    public static void passByValue(int value){
            value = 10;
    }
}
