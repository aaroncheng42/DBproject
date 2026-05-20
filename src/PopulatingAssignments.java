import java.util.ArrayList;

public class PopulatingAssignments {
    public static void print_assignments(){
        ArrayList<Assignment> assignments = Assignment.getAssignments();

        for (int i = 0; i < assignments.size(); i++) {
            System.out.println(assignments.get(i).toString());
        }
    }
}