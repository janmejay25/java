import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Grades Menu =====");
            System.out.println("1. Add/Update Student Grade");
            System.out.println("2. Display All Grades");
            System.out.println("3. Calculate Average Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade (0-100): ");
                    double grade = scanner.nextDouble();

                    grades.put(name, grade);
                    System.out.println("Grade for " + name + " has been added/updated.");
                    break;

                case 2:
                    if (grades.isEmpty()) {
                        System.out.println("No grades to display.");
                    } else {
                        System.out.println("Student Grades:");
                        for (Map.Entry<String, Double> entry : grades.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    if (grades.isEmpty()) {
                        System.out.println("No grades to calculate average.");
                    } else {
                        double total = 0;
                        for (double g : grades.values()) {
                            total += g;
                        }
                        double average = total / grades.size();
                        System.out.println("Average Grade: " + average);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter between 1-4.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
