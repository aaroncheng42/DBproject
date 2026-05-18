import java.util.ArrayList;

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
        assignments.add(new Assignment("Learning Addition", false));
        assignments.add(new Assignment("Learning Subtraction", false));
        assignments.add(new Assignment("Learning Multiplication", false));
        assignments.add(new Assignment("Learning Cooking", false));
        assignments.add(new Assignment("Learning Exponents", false));
        assignments.add(new Assignment("Learning Square Roots", false));
        assignments.add(new Assignment("Learning Division", false));
        assignments.add(new Assignment("MP1 Math Test", true));
        assignments.add(new Assignment("Learning About Parabolas", false));
        assignments.add(new Assignment("Learning Graphing", false));
        assignments.add(new Assignment("Learning Business", false));
        assignments.add(new Assignment("MP1 Business Test", true));
        assignments.add(new Assignment("Learning Scratch", false));
        assignments.add(new Assignment("Learning Java", false));
        assignments.add(new Assignment("Learning Selection & Iteration", false));
        assignments.add(new Assignment("Learning Conditionals", false));
        assignments.add(new Assignment("Learning Recursion", false));
        assignments.add(new Assignment("Learning Lists", false));
        assignments.add(new Assignment("MP1 Coding Test", true));
        assignments.add(new Assignment());
        assignments.add(new Assignment());
        assignments.add(new Assignment());
        assignments.add(new Assignment());
        assignments.add(new Assignment());
        return assignments;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public boolean getAssignmentType() {
        return isMajor;
    }
}