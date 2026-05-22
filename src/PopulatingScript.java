import java.io.IOException;

public class PopulatingScript {

    public PopulatingScript() {
    }
    public void start() throws IOException {
        Room.printRooms();
        Department.printDepartments();
        Course.printCourses();
        PopulatingAssignments.print_assignments();
        Teacher.printTeachers();
    }
}