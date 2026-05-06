public class Teachers {
    private String teacherName = "";
    private int teacherID = 0;
    static int counter = 1;

    public Teachers(String teacherName) {
        this.teacherName = teacherName;
        teacherID = counter;
        counter++;
    }

    public int getTeacherID() {
        return teacherID;
    }
}
