class Student {
    String name;
    int rollNo;
    int[] credits;
    int[] grades; // Grades out of 10
    int numSubjects;

    // Constructor
    Student(String name, int rollNo, int[] credits, int[] grades) {
        this.name = name;
        this.rollNo = rollNo;
        this.credits = credits;
        this.grades = grades;
        this.numSubjects = credits.length;
    }

    // Method to calculate SPI
    double calculateSPI() {
        int totalCredits = 0;
        int weightedSum = 0;
        for (int i = 0; i < numSubjects; i++) {
            totalCredits += credits[i];
            weightedSum += grades[i] * credits[i];
        }
        return (double) weightedSum / totalCredits;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("SPI: " + String.format("%.2f", calculateSPI()));
        System.out.println();
    }
}

public class SPICalculator {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java SPICalculator <data>");
            System.out.println("Format: name rollNo credit1 grade1 credit2 grade2 ...");
            return;
        }

        int i = 0;
        while (i < args.length) {
            try {
                String name = args[i++];
                int rollNo = Integer.parseInt(args[i++]);

                int subjectCount = (args.length - i) / 2;
                int[] credits = new int[subjectCount];
                int[] grades = new int[subjectCount];

                for (int j = 0; j < subjectCount; j++) {
                    credits[j] = Integer.parseInt(args[i++]);
                    grades[j] = Integer.parseInt(args[i++]);
                }

                Student s = new Student(name, rollNo, credits, grades);
                s.display();
            } catch (Exception e) {
                System.out.println("Invalid input format or insufficient arguments.");
                break;
            }
        }
    }
}
