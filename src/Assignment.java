import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {
    private String assignmentName;
    private boolean isMajor;

    public Assignment(String name, boolean major) {
        assignmentName = name;
        isMajor = major;
    }

    @Override
    public String toString() {
        return "INSERT INTO Assignments (assignmentName, isMajor) VALUES ('" + getAssignmentName() + "', " + getAssignmentType() + ");";
    }

    public static ArrayList<Assignment> getAssignments() {
        ArrayList<Assignment> assignments = new ArrayList<>();
        File f = new File("./Assignment.txt");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                assignments.add(new Assignment(sc.nextLine(), (int)(Math.random()*2) == 1));
            }
            sc.close();
            return assignments;
        } catch (Exception e) {
            return new ArrayList<Assignment>();
        }
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public boolean getAssignmentType() {
        return isMajor;
    }
}