package com.codealpha.gradetrackingstudent;

import java.util.Scanner;

public class GradeTrackingStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create arrays to store student names and grades
        String[] studentNames = new String[numStudents];
        double[] studentGrades = new double[numStudents];

        // Input student names and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.next();

            System.out.print("Enter the grade of student " + (i + 1) + ": ");
            studentGrades[i] = scanner.nextDouble();
        }

        // Calculate average, highest, and lowest grades
        double sum = 0;
        double highestGrade = studentGrades[0];
        double lowestGrade = studentGrades[0];
        int highestIndex = 0;
        int lowestIndex = 0;

        for (int i = 0; i < numStudents; i++) {
            double grade = studentGrades[i];
            sum += grade;

            if (grade > highestGrade) {
                highestGrade = grade;
                highestIndex = i;
            }

            if (grade < lowestGrade) {
                lowestGrade = grade;
                lowestIndex = i;
            }
        }

        // Calculate average grade
        double averageGrade = sum / numStudents;

        // Display results
        System.out.println("\nGrade Summary:");
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Highest Grade: " + highestGrade + " (Student: " + studentNames[highestIndex] + ")");
        System.out.println("Lowest Grade: " + lowestGrade + " (Student: " + studentNames[lowestIndex] + ")");

        // Close the scanner
        scanner.close();
    }
}