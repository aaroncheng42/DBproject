public class Offer {
    private int period;
    private int offeringID = 0;
    private Departments departments;
    private int departmentID;
    private Assignments assignments;
    private int assignmentID;
    private Teachers teacher;
    private int teacherID;
    static int counter = 1;
    // add roster and courses later

    public Offer(int period, Departments department, Assignments assignments, Teachers teacher) {
        this.period = period;
        departments = department;
        departmentID = department.getDepartmentID();
        this.assignments = assignments;
        assignmentID = assignments.getAssignmentID();
        teacherID = teacher.getTeacherID();
        this.teacher = teacher;
        offeringID = counter;
        counter++;
        // add roster and courses later
        }

    public int getOfferingID() {
        return offeringID;
    }
}

