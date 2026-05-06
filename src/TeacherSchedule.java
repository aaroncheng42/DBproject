public class TeacherSchedule {
    private int offeringID;
    private Offer offer;
    private int teacherID;
    private Teachers teachers;

    public TeacherSchedule (Teachers teacher, Offer offer) {
        offeringID = offer.getOfferingID();
        this.offer = offer;
        teacherID = teacher.getTeacherID();
        teachers = teacher;
    }
}
