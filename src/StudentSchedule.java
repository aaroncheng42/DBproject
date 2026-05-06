public class StudentSchedule {
    private Offer offer;
    private int offeringID;
    private int studentID;
    private Students students;

    public StudentSchedule (Students student, Offer offer) {
        offeringID = offer.getOfferingID();
        this.offer = offer;
        students = student;
        offeringID = offer.getOfferingID();studentID = student.getStudentID();
    }
}


