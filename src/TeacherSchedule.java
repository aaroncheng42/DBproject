public class TeacherSchedule {
    private int[] offeringID;
    private Offering[] offering;
    private int teacherID;
    private Teacher teachers;

    public TeacherSchedule (Teacher teacher, Offering[] offering) {
        offeringID = new int[offering.length];
        for (int offerIndex = 0; offerIndex < offering.length; offerIndex++) {
            offeringID[offerIndex] = offering[offerIndex].getOfferingID();
        }
        this.teachers = teacher;
        teacherID = teacher.getTeacherID();
    }
}
