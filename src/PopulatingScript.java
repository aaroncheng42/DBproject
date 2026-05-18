import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulatingScript {

    public PopulatingScript() {
    }
    public void start(){
        RoomCreator r = new RoomCreator();
        System.out.println(r);
        DepartmentCreator d = new DepartmentCreator();
        System.out.println(d);
        PopulateCourses.print_courses();
        PopulatingAssignments.print_assignments();
        try {
            teacherCreator t = new teacherCreator(d);
            System.out.println(t);
        } catch (Exception e) {
        }

    }
    
}