public class StudentSchedule {
    private Offering[] offering;
    private int[] offeringID;
    private int studentID;
    private Student student;

    public StudentSchedule (Student student, Offering[] offering) {
        offeringID = new int[offering.length];
        for (int offerIndex = 0; offerIndex < offering.length; offerIndex++) {
            offeringID[offerIndex] = offering[offerIndex].getOfferingID();
        }
        this.student = student;
        studentID = student.getStudentID();
    }

    public int[] getOfferingID() {
        return offeringID;
    }
}
