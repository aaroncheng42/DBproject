public class TeacherSchedule {
    private int[] offeringID;
    private Offer[] offer;
    private int teacherID;
    private Teachers teachers;

    public TeacherSchedule (Teachers teacher, Offer[] offer) {
        for (int offerIndex = 0; offerIndex < offer.length; offerIndex++) {
            offeringID[offerIndex] = offer[offerIndex].getOfferingID();
        }
        this.teachers = teacher;
        teacherID = teacher.getTeacherID();
    }
}
