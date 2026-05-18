public class Teachers {
    private String teacherName = "";
    private int teacherID ;
    static int counter = 0;
    private int departmentID;

    public Teachers(String teacherName, int departmentID) {
        this.teacherName = teacherName;
        this.departmentID = departmentID;
        teacherID = ++counter;
    }

    public int getTeacherID() {
        return teacherID;
    }
    public int getDepartmentID() {
        return departmentID;
    }
    public String getTeacherName() {
        return teacherName;
    }
}
