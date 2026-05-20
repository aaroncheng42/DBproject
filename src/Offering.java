public class Offering {
    private int period;
    private int offeringID;
    private Assignment[] assignments;
    private int[] assignmentID;
    private Teachers teacher;
    private int teacherID;
    private static int counter = 0;
    private int rosterID;
    private Course course;
    private int courseID;


    public Offering(Assignment[] assignments, Course course, Teachers teacher, Roster roster) {
        this.period = (teacher.getAvaliablePeriods()).get((int)(Math.random()*teacher.getAvaliablePeriods().size()));
        teacher.removePeriods(period);
        this.assignments = assignments;
        int count = 0;
        for (Assignment assignment : assignments) {
            assignmentID[count] = assignment.getAssignmentID();
            count++;
        }
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


