import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.List;

public class Students {
    private String studentName = "";
    private int studentID;
    static int counter = 0;

    public Students(String name) {
        studentName = name;
        studentID = ++counter;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }


    //For the student population script, make a loop that calls the student constructor and for the studentName parameter you should get it from a file with all 5000 studentNames
    @Override
    public String toString() {
        return "INSERT INTO Students (studentName) VALUES (" + getStudentName() + ")";

    }
//    (Stream<String> stream = Files.lines(Paths.get("names.txt")))

    public static class StudentPopulation2 {
        public static <Student> void main(String[] args) {
            Path path = Paths.get("src/names.txt");
            try (Scanner readFile = new Scanner(path)) {
                List<String> lines = Files.readAllLines(Paths.get(path.toUri()));
                Collections.sort(lines);
                String currentLine = String.join("\n", lines);
                List<Student> students = new ArrayList<>();
                for (String Lines : lines) {
                    Student s = new Student();
                    students.add(s);
                }
                for (Student s : students) {
                    System.out.println(s);
                }
            } catch (IOException e) {
                System.out.println("Can't find the file.");
            } catch (Exception e) {
                System.out.println("Some weird error occurred. I can't handle ts");
            }
        }
    }
}