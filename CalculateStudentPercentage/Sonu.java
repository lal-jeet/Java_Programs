package CalculateStudentPercentage;

public class Sonu {
    public static void main(String[] args) {
        ScienceStudent scienceStudent = new ScienceStudent("Anjali", 101, 85, 90, 80);
        ArtsStudent artsStudent = new ArtsStudent("Aryan", 102, 75, 80, 85);

        System.out.println("Science Student Details:");
        scienceStudent.displayDetails();
        System.out.println("Percentage: " + scienceStudent.calculatePercentage() + "%");

        System.out.println("\nArts Student Details:");
        artsStudent.displayDetails();
        System.out.println("Percentage: " + artsStudent.calculatePercentage() + "%");
    }
}