package Lab1_Java_Refresher_Setup;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class StudentManager {

    public static void main(String[] args) {
        // Add multiple students to an ArrayList
        System.out.println("--- 1. Adding Students ---");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Alice", 88.5));
        studentList.add(new Student(102, "Bob", 92.0));
        studentList.add(new Student(103, "Charlie", 76.0));
        studentList.add(new Student(104, "Diana", 95.5));
        System.out.println("Four students have been added to the list.\n");

        // Display the list of all students
        System.out.println("--- 2. Displaying All Students ---");
        displayStudents(studentList);

        // Search for a student by ID
        System.out.println("\n--- 3. Searching for a Student (ID: 102) ---");
        searchStudentById(studentList, 102);
        System.out.println("\n--- Searching for a Student (ID: 999) ---");
        searchStudentById(studentList, 999); // Search for a non-existent ID

        // Remove a student from the list
        System.out.println("\n--- 4. Removing a Student (ID: 103) ---");
        removeStudentById(studentList, 103);
        System.out.println("List after removal:");
        displayStudents(studentList);

        // Sort the list by grade in descending order
        System.out.println("\n--- 5. Sorting Students by Grade (Descending) ---");
        // Using a lambda expression for the comparator
        studentList.sort(Comparator.comparingDouble(Student::getGrade).reversed());
        System.out.println("List after sorting:");
        displayStudents(studentList);
    }

    /** Display students list  */
    public static void displayStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("The student list is empty.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**Searches for a student in the list by their ID.*/
    public static void searchStudentById(ArrayList<Student> students, int id) {
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student found: " + student);
                found = true;
                break; // Exit the loop once the student is found
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    /** Removes a student from the list by their ID.*/
    public static void removeStudentById(ArrayList<Student> students, int id) {
        // Using removeIf with a lambda is a safe and modern way to remove elements
        boolean removed = students.removeIf(student -> student.getId() == id);
        
        if (removed) {
            System.out.println("Student with ID " + id + " has been removed.");
        } else {
            System.out.println("Could not remove. Student with ID " + id + " not found.");
        }
    }
}
