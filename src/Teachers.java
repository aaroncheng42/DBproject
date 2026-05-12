public class Teachers {
    private String teacherName = "";
    private int teacherID ;
    static int counter = 0;

    public Teachers(String teacherName) {
        this.teacherName = teacherName;
        teacherID = ++counter;
    }

    public int getTeacherID() {
        return teacherID;
    }
}
