public class Offer {
    private int period;
    private int offeringID = 0;
    private Assignment assignments;
    private int assignmentID;
    private Teachers teacher;
    private int teacherID;
    private static int counter = 0;
    private int rosterID;
    private Course course;
    private int courseID;

    public Offer(int period, Assignment assignments, int assignmentID, Course course, Teachers teacher, Roster roster) {
        this.period = period;
        this.assignments = assignments;
        this.assignmentID = assignments.getAssignmentID();
        teacherID = teacher.getTeacherID();
        this.teacher = teacher;
        rosterID = roster.getRosterID();
        offeringID = ++counter;
        courseID = course.getCourseID();
        this.course = course;
    }

    public int getOfferingID() {
        return offeringID;
    }
}

