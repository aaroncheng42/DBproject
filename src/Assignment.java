import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {
    private String assignmentName;
    private boolean isMajor;
    private int assignmentID;
    private static int counter = 0;

    public Assignment(String name, boolean major) {
        assignmentName = name;
        isMajor = major;
        assignmentID = ++counter;
    }

    @Override
    public String toString() {
        return "INSERT INTO Assignments (AssignmentName, isMajor) VALUES ('" + getAssignmentName() + "', " + getAssignmentType() + ");\n";
    }

    public static ArrayList<Assignment> getAssignments() {
        counter = 0;
        ArrayList<Assignment> assignments = new ArrayList<>();
        File f = new File("/home/keruic3/Projects/database/src/files/assignments.txt");
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

    public static void printAssignments() {
        ArrayList<Assignment> assignments = Assignment.getAssignments();

        for (int i = 0; i < assignments.size(); i++) {
            System.out.println(assignments.get(i).toString());
        }
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public boolean getAssignmentType() {
        return isMajor;
    }

    public int getAssignmentID() {
        return assignmentID;
    }
}