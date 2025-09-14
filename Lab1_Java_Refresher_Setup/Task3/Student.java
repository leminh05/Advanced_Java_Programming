package Lab1_Java_Refresher_Setup.Task3;

/**
 * Represents a student with an ID, name, and grade.
 */
public class Student {
    private int id;
    private String name;
    private double grade;

    /**
     * Constructs a new Student object.
     *
     * @param id    The student's unique ID.
     * @param name  The student's name.
     * @param grade The student's grade.
     */
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // --- Getters ---

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    /**
     * Returns a string representation of the student's details.
     * This makes it easy to print student information.
     */
    @Override
    public String toString() {
        return "Student{" +
               "ID=" + id +
               ", Name='" + name + '\'' +
               ", Grade=" + grade +
               '}';
    }
}

