public class Students {
    private String studentName = "";
    private int studentID;
    static int counter = 0;

    public Students(String name) {
        studentName = name;
        studentID = ++counter;
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