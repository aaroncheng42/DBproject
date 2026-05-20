import java.util.ArrayList;

public class PopulateCourses {
    public static void print_courses () {
        ArrayList<Course> courses = Course.getCourses();

        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i).toString());
        }
    }
}
