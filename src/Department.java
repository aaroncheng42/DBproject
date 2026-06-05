import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    private int departmentID;
    private String departmentName = "";
    private static int counter = 0;

    public Department(String dpt) {
        departmentName = dpt;
        departmentID = ++counter;
    }

    @Override
    public String toString() {
        return "INSERT INTO Departments (department) VALUES ('" + departmentName + "');\n";
    }

    public static ArrayList<Department> getDepartments() throws FileNotFoundException {
        counter = 0;
        ArrayList<Department> departments = new ArrayList<>();
        Scanner scanner = new Scanner(new File("src/files/departments.txt"));

        while (scanner.hasNextLine()) {
            String dpt = scanner.nextLine();
            departments.add(new Department(dpt));
        }

        scanner.close();
        return departments;
    }

    public static void printDepartments() throws FileNotFoundException {
        ArrayList<Department> departments = Department.getDepartments();

        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i).toString());
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
