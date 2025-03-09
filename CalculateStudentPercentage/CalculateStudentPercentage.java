package CalculateStudentPercentage;


class CalculateStudentPercentage {
    protected String name;
    protected int rollNumber;

    public CalculateStudentPercentage(String name, int rollNumber) {
        if (rollNumber <= 0) {
            System.out.println("Error Invalid Input");
            return;
        }
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public double calculatePercentage() {
        return 0.0;
    }
}

class ScienceStudent extends CalculateStudentPercentage {
    private int physicsMarks;
    private int chemistryMarks;
    private int mathMarks;

    public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
        super(name, rollNumber);
        if (physicsMarks <= 0 || chemistryMarks <= 0 || mathMarks <= 0) {
            System.out.println("Error Invalid Input");
            return;
        }
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathMarks = mathMarks;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Physics Marks: " + physicsMarks);
        System.out.println("Chemistry Marks: " + chemistryMarks);
        System.out.println("Math Marks: " + mathMarks);
    }

    @Override
    public double calculatePercentage() {
        return (physicsMarks + chemistryMarks + mathMarks) / 3.0;
    }
}

class ArtsStudent extends CalculateStudentPercentage {
    private int historyMarks;
    private int geographyMarks;
    private int englishMarks;

    public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
        super(name, rollNumber);
        if (historyMarks <= 0 || geographyMarks <= 0 || englishMarks <= 0) {
            System.out.println("Error Invalid Input");
            return;
        }
        this.historyMarks = historyMarks;
        this.geographyMarks = geographyMarks;
        this.englishMarks = englishMarks;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("History Marks: " + historyMarks);
        System.out.println("Geography Marks: " + geographyMarks);
        System.out.println("English Marks: " + englishMarks);
    }

    @Override
    public double calculatePercentage() {
        return (historyMarks + geographyMarks + englishMarks) / 3.0;
    }
}