import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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

    public static ArrayList<Student> getStudentSchedule() throws FileNotFoundException {
        ArrayList<Student> studentSchedule = new ArrayList<>();


        return studentSchedule;
    }

    public int getStudentID() {
        return studentID;
    }

    public int[] getOfferingID() {
        return offeringID;
    }

    @Override
    public String toString() {
        return "INSERT INTO StudentsSchedule (studentID, offeringID) VALUES ('" + getStudentID() + "', " + getOfferingID() + "');";
    }
}
