import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class StudentPopulation2 {
    public static void studentsPopulatingScript() {
        int count = 0;
       ArrayList<Students> students = new ArrayList<>();
       try {
           File file = new File("src/files/studentnames.txt");
           Scanner scan = new Scanner(file);
           while (scan.hasNextLine()) {
               String studentNames = scan.nextLine();
               students.add(new Students(studentNames));
           }
           for (Students s : students) {
               count++;
               System.out.println(s);
           }
           scan.close();
       }
       catch (FileNotFoundException e) {
           System.out.println("Can't find ts file.");
       }
    }
    public static void main(String[] args) {
       //to test out the script to see if it works
        studentsPopulatingScript();
    }
}
