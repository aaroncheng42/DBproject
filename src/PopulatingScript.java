import java.io.IOException;

public class PopulatingScript {

    public PopulatingScript() {
    }
    public void start() throws IOException {
        RoomCreator r = new RoomCreator();
        System.out.println(r);
        DepartmentCreator d = new DepartmentCreator();
        System.out.println(d);
        Course.print_courses();
        PopulatingAssignments.print_assignments();
        try {
            teacherCreator t = new teacherCreator(d);
            System.out.println(t);
        } catch (Exception e) {
        }

    }
    
}