import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Offering {
    private int period;
    private int offeringID = 0;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> students;
    private Teacher teacher;
    static int counter = 1;
    private Course course;
    private Room room;


    public Offering(int period, ArrayList<Assignment> assignments, Course course, Teacher teacher, Room room, ArrayList<Student> students) {
        this.period = period;
        this.assignments = assignments;
        this.room = room;
        this.students = students;
        this.teacher = teacher;
        offeringID = ++counter;
        this.course = course;
    }

    @Override
    public String toString() {
        String initial = "";
        for (Assignment a : this.assignments) {
            initial += "INSERT INTO OfferingToAssignments (OfferingID, AssignmentID) VALUES (" + offeringID + ", "+ a.getAssignmentID() +");\n";
        }
        for (Student s : this.students) {
            for (Assignment a : this.assignments) {
                initial += "INSERT INTO Grades (StudentID, OfferingID, AssignmentID, Grade) VALUES (" + s.getStudentID() + ", " + offeringID + ", " + a.getAssignmentID() + ", " + ((int) (Math.random() * (100 - 75 + 1)) + 75) + ");\n";
            }
            initial += "INSERT INTO Rosters (OfferingID, StudentID) VALUES (" + offeringID + ", " + s.getStudentID() + ");\n";
        }
        initial += "INSERT INTO TeacherSchedule  (OfferingID, TeacherID) VALUES (" + offeringID + ", "+ teacher.getTeacherID() +")\n";
        initial += "INSERT INTO Offering (Period, RoomID, CourseID, TeacherID) VALUES ("+ period + ", " + room.getRoomID() + ", " + course.getCourseID() + ", " + teacher.getTeacherID()+ ");\n";
        return initial;
    }

    public int getOfferingID() {
        return offeringID;
    }

    public int getPeriod() {
        return period;
    }

    public static void printOffering() throws FileNotFoundException {
        ArrayList<Offering> offs = getOfferings();
        for(Offering o : offs){
            System.out.println(o);
        }
    }

    public static ArrayList<Offering> getOfferings() throws FileNotFoundException {
        counter = 0;
        ArrayList<Offering> offerings = new ArrayList<>();
        ArrayList<Teacher> teachers = Teacher.getTeachers();
        ArrayList<Assignment> assignments = Assignment.getAssignments();
        ArrayList<Room> rooms = Room.getRooms();
        ArrayList<Course> courses = Course.getCourses();
        ArrayList<Student> students = Student.getStudents();

        while(!teachers.isEmpty() &&!students.isEmpty()){
            Teacher selectedTeacher =  teachers.get((int)(teachers.size()*Math.random()));
            int period = selectedTeacher.getAvaliablePeriods().get((int)(Math.random()*selectedTeacher.getAvaliablePeriods().size()));
            selectedTeacher.getAvaliablePeriods().remove(Integer.valueOf(period));
            if(selectedTeacher.getAvaliablePeriods().isEmpty()){
                teachers.remove(selectedTeacher);
            }
            Collections.shuffle(assignments);
            ArrayList<Assignment> selectedAssignments = new ArrayList<>();
            int minorCounter = 0;
            int majorCounter = 0;
            for (Assignment a : assignments) {
                if (!(a.getAssignmentType())) {
                    if (minorCounter < 12) {
                        selectedAssignments.add(a);
                    }
                    minorCounter++;
                } else {
                    if (majorCounter < 3) {
                        selectedAssignments.add(a);
                    }
                    majorCounter++;
                }
                if (minorCounter == 12 && majorCounter == 3) {
                    break;
                }
            }

            int numStuSelected = 0;
            ArrayList<Student> selectedStudents = new ArrayList<>();
            while(numStuSelected < 32 || students.isEmpty()){
                Student s = students.get((int)(Math.random()*students.size()));
                if(s.getAvaliablePeriods().contains(period)){
                    selectedStudents.add(s);
                    numStuSelected++;
                }
            }
            Course selectedCourse = courses.get((int)(Math.random()*courses.size()));
            selectedCourse.updateTimesOffered();
            if (selectedCourse.getTimesOffered() == (int) (Math.random()*5) + 1) {
                courses.remove(selectedCourse);
            }
            Room selectedRoom = rooms.get((int)(Math.random()*rooms.size()));
            offerings.add(new Offering(period, selectedAssignments, selectedCourse, selectedTeacher, selectedRoom, selectedStudents));
        }
        return offerings;
    }
}

