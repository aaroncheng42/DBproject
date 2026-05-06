public class Assignments {
    private String assignmentName = "";
    private int assignmentID = 0;
    boolean isMajor;
    static int counter = 1;

    public Assignments(String assignmentName, boolean isMajor) {
        this.assignmentName = assignmentName;
        assignmentID = counter;
        counter++;
    }

    public int getAssignmentID() {
        return assignmentID;
    }
}
