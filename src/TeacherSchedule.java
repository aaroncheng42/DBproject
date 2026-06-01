import java.util.ArrayList;


public class TeacherSchedule {
    private Offering offering;
    private int teacherID;
    private int offeringID;
    private Teacher teacher;
    private static int tempTeacherID;
    private static int tempOfferingID;

    public TeacherSchedule (Teacher teacher, Offering offering) {
        this.offering = offering;
        offeringID = offering.getOfferingID();
        this.teacher = teacher;
        teacherID = teacher.getTeacherID();
    }


    public int getTeacherID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return "INSERT INTO TeacherSchedule (TeacherID, OfferingID) VALUES (" + teacherID + ", " + tempOfferingID + ");";
    }

    // TeacherID | Offering
    public int getOfferingID() {
        return offeringID;
    }

    public static void printTeacherSchedule () {
        for (int i = 0; i < Teacher.teachers.size(); i++) {
            for (Offering offering1 : Teacher.teachers.get(i).getTeachersOfferings()) {
                tempOfferingID = offering1.getOfferingID();
                System.out.println(Teacher.teachers.get(i).toString());
            }
        }
    }
}

// in  allteachers make dupes of the same teacher with their different offerings and use the tostring method on that
