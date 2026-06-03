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
        for(Assignment a : this.assignments){
            initial += "INSERT INTO OfferingToAssignments (offeringID, assignmentID) VALUES ("+offeringID +", "+ a.getAssignmentID() +")\n";
        }
        for(Student s : this.students){
            initial += "INSERT INTO Rosters (offeringID, studentsID) VALUES ("+offeringID +", "+ s.getStudentID() +")\n";
        }
        initial += "INSERT INTO TeacherSchedule  (offeringID, teacherID) VALUES ("+offeringID +", "+ teacher.getTeacherID() +")\n";
        initial += "INSERT INTO Offering (period, roomID, courseID, teacherID) VALUES ("+period +", "+ room.getRoomID() +", "+ course.getCourseID() +", "+ teacher.getTeacherID()+")\n";
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
        int courseCounter = 0;
        ArrayList<Offering> offers = new ArrayList<>();
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
            ArrayList<Assignment> selectedAssignments = new ArrayList<>(assignments.subList(0, (int)(Math.random()*80+40)));
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
            selectedCourse.updateCourseCounter();
            if (selectedCourse.getCourseCounter() == (int) (Math.random()*5) + 1) {
                courses.remove(selectedCourse);
            }
            Room selectedRoom = rooms.get((int)(Math.random()*rooms.size()));
            offers.add(new Offering(period, selectedAssignments, selectedCourse, selectedTeacher, selectedRoom, selectedStudents));
        }
        return offers;
    }
}

