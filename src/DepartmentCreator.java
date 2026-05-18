import java.util.ArrayList;

public class DepartmentCreator {
    public static final String[] DEPARTMENTS = {"Biology", "Math", "ELA", "Chemistry", "CS"};
    private ArrayList<Departments> referencesList = new ArrayList<>();
    public DepartmentCreator(){
        for(String s : DEPARTMENTS){
            referencesList.add(new Departments(s));
        }
    }
    public ArrayList<Departments> getRefrencesList() {
        return referencesList;
    }
    @Override
    public String toString() {
        String total_concat = "";
        for(String s : DEPARTMENTS){
            total_concat += "INSERT INTO Departments (departmentName) VALUES " + "(\'"+s+"\')" + ";\n";
        }
        return total_concat;
    }
}