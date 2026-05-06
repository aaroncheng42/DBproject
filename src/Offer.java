public class Offer {
    private int period;
    private int offeringID = 0;
    private Assignments assignments;
    private int assignmentID;
    private Teachers teacher;
    private int teacherID;
    static int counter = 1;
    private int rosterID;
    // add roster and courses later
    // department needed?
    public Offer(int period, Assignments assignments, Teachers teacher, Roster roster) {
        this.period = period;
        this.assignments = assignments;
        assignmentID = assignments.getAssignmentID();
        teacherID = teacher.getTeacherID();
        this.teacher = teacher;
        rosterID = roster.getRosterID();
        offeringID = counter;
        counter++;
        // add roster and courses later
        }

    public int getOfferingID() {
        return offeringID;
    }
}

