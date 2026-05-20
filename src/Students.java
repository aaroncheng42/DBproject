import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.List;

public class Students {
    private String studentName = "";
    private int studentID;
    static int counter = 0;

    public Students(String name) {
        studentName = name;
        studentID = ++counter;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }


    //For the student population script, make a loop that calls the student constructor and for the studentName parameter you should get it from a file with all 5000 studentNames
    @Override
    public String toString() {
        return "INSERT INTO Students (studentName) VALUES (\'" + getStudentName() + "\') \n" + "( " + getStudentName() + " )";

    }
//    (Stream<String> stream = Files.lines(Paths.get("studentnames.txt")))

}