public class Students {
    private String studentName = "";
    private int studentID = 0;
    static int counter = 1;

    public Students(String name) {
        studentName = name;
        studentID = counter;
        counter++;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "INSERT INTO Students (studentName) VALUES (" + getStudentName() + ");";
    }
}