public class Offering {
    private int period;
    private int offeringID = 0;
    private Assignment[] assignments;
    private int[] assignmentID;
    private Teacher teacher;
    private int teacherID;
    static int counter = 1;
    private int rosterID;
    private Course course;
    private int courseID;


    public Offering(int period, Assignment[] assignments, Course course, Teacher teacher, Roster roster) {
        this.period = period;
        this.assignments = assignments;
        int count = 0;
        for (Assignment assignment : assignments) {
            assignmentID[count] = assignment.getAssignmentID();
            count++;
        }
        teacherID = teacher.getTeacherID();
        this.teacher = teacher;
        rosterID = roster.getRosterID();
        offeringID = counter;
        counter++;
        courseID = course.getCourseID();
        this.course = course;
    }


    public int getOfferingID() {
        return offeringID;
    }


    public int getPeriod() {
        return period;
    }


    public int getCourseID() {
        return courseID;
    }


    public Assignment[] getAssignments() {
        return assignments;
    }


    public int[] getAssignmentID() {
        return assignmentID;
    }
}


