import java.util.ArrayList;

public class PopulatingAssignments {
    public static void main(String[] args) {
        ArrayList<Course> assignments = Assignment.getAssignments();

        for (int i = 0; i < assignments.size(); i++) {
            System.out.println(assignments.get(i).toString());
        }
    }
}