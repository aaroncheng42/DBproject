import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class teacherCreator{

    private ArrayList<Teachers> teacherRefs = new ArrayList<>();

    public teacherCreator(DepartmentCreator d) throws FileNotFoundException{
        File f = new File("src/files/staff.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNext()){
            teacherRefs.add(new Teachers(sc.nextLine(), d.getRefrencesList().get((int)(Math.random()*d.getRefrencesList().size())).getDepartmentID()));
        }
        sc.close();
    }
    public ArrayList<Teachers> getTeacherRefs() {
        return teacherRefs;
    }
    @Override
    public String toString() {
        String total_concat = "";
        for(Teachers t :teacherRefs){
            total_concat += "INSERT INTO Teachers (departmentID, teacherName) VALUES " + "(\'"+t.getDepartmentID()+", " + "\'"+t.getTeacherName()+"\')" + ";\n";
        }
        return total_concat;
    }
}