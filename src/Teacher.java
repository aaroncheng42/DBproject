import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    private String teacherName = "";
    private int teacherID ;
    private static int counter = 0;
    private int departmentID;
    private ArrayList<Integer> avaliablePeriods = new ArrayList<>();

    public Teacher(String name) throws FileNotFoundException {
        teacherName = name;
        departmentID = (int) (Math.random() * Department.getDepartments().size()) + 1;
        teacherID = ++counter;
        for(int i = 1; i <= 10; i++){
            avaliablePeriods.add(i);
        }
    }

    @Override
    public String toString() {
        return "INSERT INTO Teachers (teacherName, departmentID) VALUES ('" + getTeacherName() + "', '" + getDepartmentID() + "');";
    }

    public static ArrayList<Teacher> getTeachers() throws FileNotFoundException {
        ArrayList<Teacher> teachers = new ArrayList<>();
        Scanner scanner = new Scanner(new File("src/files/rooms.txt"));

        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            teachers.add(new Teacher(name));
        }

        scanner.close();
        return teachers;
    }

    public static void printTeachers() throws FileNotFoundException {
        ArrayList<Teacher> teachers = Teacher.getTeachers();

        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).toString());
        }
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void removePeriods(int x){
        avaliablePeriods.remove(avaliablePeriods.indexOf(x));
    }
    public ArrayList<Integer> getAvaliablePeriods() {
        return avaliablePeriods;
    }
}
