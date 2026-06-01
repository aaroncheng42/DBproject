import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String studentName = "";
    private int studentID;
    static int counter = 0;

    public Student(String name) {
        studentName = name;
        studentID = ++counter;
    }

    public static void printStudents() throws FileNotFoundException {
        ArrayList<Student> students = Student.getStudents();

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }

    public static ArrayList<Student> getStudents() throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(new File("src/files/studentnames.txt"));

        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            students.add(new Student(name));
        }

        scanner.close();
        return students;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "INSERT INTO Students (studentName, studentID) VALUES ('" + getStudentName() + "', " + getStudentID() + ");";
    }
}