import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentPopulation2 {
    public static <Student> void studentsPopulatingScript() {
        int count = 0;
        Path path = Paths.get("src/names.txt");
        try {
            List<String> lines = Files.readAllLines(path);
//            Collections.sort(lines);
//            String currentLine = String.join("\n", lines);
            List<Student> studentList = new ArrayList<>();
            for (String name : lines) {
                if (!name.trim().isEmpty()) {
                    studentList.add((Student) new Students(name));
                }
            }
            for (Student s : studentList) {
                count++;
                System.out.println(s);
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("Can't find the file.");
        } catch (Exception e) {
            System.out.println("Some weird error occurred. I can't handle ts");
        }
    }
    public static void main(String[] args) {
//        to test out the script to see if it works
        studentsPopulatingScript();
    }
}


