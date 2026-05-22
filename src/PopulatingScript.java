import java.io.IOException;

public class PopulatingScript {

    public PopulatingScript() {
    }
    public void start() throws IOException {
        Room.printRooms();
        DepartmentCreator d = new DepartmentCreator();
        System.out.println(d);
        Course.printCourses();
        PopulatingAssignments.print_assignments();
        try {
            teacherCreator t = new teacherCreator(d);
            System.out.println(t);
        } catch (Exception e) {
        }

    }
    
}