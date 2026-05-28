import java.util.ArrayList;


public class TeacherSchedule {
    private int[] offeringID;
    private Offering[] offering;
    private int teacherID;
    private Teacher teachers;
    public static ArrayList<Teacher> allTeachers = new ArrayList<>();


    public TeacherSchedule (Teacher teacher, Offering[] offering) {
        offeringID = new int[offering.length];
        for (int offerIndex = 0; offerIndex < offering.length; offerIndex++) {
            offeringID[offerIndex] = offering[offerIndex].getOfferingID();
        }
        this.teachers = teacher;
        teacherID = teacher.getTeacherID();
    }


    public int getTeacherID() {
        return teacherID;
    }


    public int[] getOfferingID() {
        return offeringID;
    }


    public String populationScript() {
        String finalReturn = "";
        for (Teacher teacher : allTeachers) {
            int teacherID = teacher.getTeacherID();
            for (Offering offering1 : teacher.getTeachersOfferings()) {
                int offeringID = offering1.getOfferingID();
                finalReturn += "INSERT INTO TeacherSchedule (TeacherID, OfferingID) VALUES (" + teacherID + ", " + offeringID + ");\n";
            }
        }
        return finalReturn;
    }
}
