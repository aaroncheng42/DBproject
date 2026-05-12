import java.util.ArrayList;

public class DepartmentCreator{
    public static final String[] DEPARTMENTS = {"Biology", "Math", "ELA", "Chemistry", "CS"};
    private ArrayList<Departments> refrencesList = new ArrayList<>();
    public DepartmentCreator(){
        for(String s : DEPARTMENTS){
            refrencesList.add(new Departments(s));
        }
    }
    @Override
    public String toString() {
        String total_concat = "";
        for(String s : DEPARTMENTS){
            total_concat += "INSERT INTO Rooms (departmentName) VALUES " + "(\'"+s+"\'')" + ";\n";
        }
        return total_concat;
    }
}