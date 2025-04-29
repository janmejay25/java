class Student {
    String name;
    int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method that accepts a Student object and returns a new Student object
    public static Student updateStudent(Student s) {
        // Create a new object with updated data
        Student updatedStudent = new Student(s.name.toUpperCase(), s.rollNo + 100);
        return updatedStudent;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class updateObj {
    public static void main(String[] args) {
        // Create an object
        Student s1 = new Student("Alice", 101);

        System.out.println("Original Student:");
        s1.display();

        // Pass the object to a method and receive the returned object
        Student s2 = Student.updateStudent(s1);

        System.out.println("\nUpdated Student (Returned from Method):");
        s2.display();
    }
}
