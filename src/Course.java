import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Course {
    private int courseID;
    private String courseName;
    private String courseType;
    private static int count = 0;

    public Course(String name, String type) {
        courseID = ++count;
        courseName = name;
        courseType = type;
    }

    @Override
    public String toString() {
        return "INSERT INTO Courses (courseName, type) VALUES ('" + getCourseName() + "', '" + getCourseType() + "');";
    }

    public static void printCourses() throws FileNotFoundException {
        ArrayList<Course> courses = Course.getCourses();

        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i).toString());
        }
    }

    public static ArrayList<Course> getCourses() throws FileNotFoundException {
        count = 0;
        ArrayList<Course> courses = new ArrayList<>();
        Scanner scanner = new Scanner(new File("src/files/courses.txt"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String courseName = parts[0].trim();
            String courseType = parts[1].trim();
            courses.add(new Course(courseName, courseType));
        }

        scanner.close();
        return courses;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseType() {
        return courseType;
    }
}