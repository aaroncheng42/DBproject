public class StudentSchedule {
    private Offering[] offering;
    private int[] offeringID;
    private int studentID;
    private Students students;

    public StudentSchedule (Students students, Offering[] offering) {
        offeringID = new int[offering.length];
        for (int offerIndex = 0; offerIndex < offering.length; offerIndex++) {
            offeringID[offerIndex] = offering[offerIndex].getOfferingID();
        }
        this.students = students;
        studentID = students.getStudentID();
    }

    public int[] getOfferingID() {
        return offeringID;
    }
}
