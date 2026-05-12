public class StudentSchedule {
    private Offer[] offer;
    private int[] offeringID;
    private int studentID;
    private Students students;

    public StudentSchedule (Students students, Offer[] offer) {
        for (int offerIndex = 0; offerIndex < offer.length; offerIndex++) {
            offeringID[offerIndex] = offer[offerIndex].getOfferingID();
        }
        this.students = students;
        studentID = students.getStudentID();
    }
}
