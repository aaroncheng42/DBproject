import java.util.ArrayList;

public class Teachers {
    private String teacherName = "";
    private int teacherID ;
    static int counter = 0;
    private int departmentID;
    private ArrayList<Integer> avaliablePeriods = new ArrayList<>();

    public Teachers(String teacherName, int departmentID) {
        this.teacherName = teacherName;
        this.departmentID = departmentID;
        teacherID = ++counter;
        for(int i = 1; i < 11; i++){
            avaliablePeriods.add(i);
        }
    }
    public void removePeriods(int x){
        avaliablePeriods.remove(avaliablePeriods.indexOf(x));
    }
    public ArrayList<Integer> getAvaliablePeriods() {
        return avaliablePeriods;
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
