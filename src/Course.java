import java.util.ArrayList;

public class Course {
    private int courseID;
    private String courseName;
    private String courseType;
    private static int globalCount = 0;

    public Course(String name, String type) {
        courseID = ++globalCount;
        courseName = name;
        courseType = type;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "INSERT INTO Courses (courseName, type) VALUES (" + getCourseName() + ", " + getCourseType() + ");";
=======
        return "INSERT INTO Courses (courseName, type) VALUES ('" + getCourseName() + "', '" + getCourseType() + "');";
>>>>>>> d6f8e6971353592b8601a1df30c97c2da7a06c03
    }

    public static ArrayList<Course> getCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Anatomy", "Elective"));
        courses.add(new Course("AP Biology", "AP"));
        courses.add(new Course("AP Environmental Science", "AP"));
        courses.add(new Course("AP Psychology", "AP"));
        courses.add(new Course("Genetics", "Elective"));
        courses.add(new Course("Introduction to Neuroscience", "Elective"));
        courses.add(new Course("Living Environment", "Regents"));
        courses.add(new Course("Environmental Sustainability", "Elective"));
        courses.add(new Course("Chemistry", "Regents"));
        courses.add(new Course("AP Chemistry", "AP"));
        courses.add(new Course("Introduction to Chemical Engineering", "Elective"));
        courses.add(new Course("Organic Chemistry", "Elective"));
        courses.add(new Course("Modern Chemical Instrumental Analysis", "Elective"));
        courses.add(new Course("Quantitative Analysis", "Elective"));
        courses.add(new Course("Forensics", "Elective"));
        courses.add(new Course("AP Computer Science Principles", "AP"));
        courses.add(new Course("AP Computer Science A", "AP"));
        courses.add(new Course("Big Data: Warehousing & Analytics", "Elective"));
        courses.add(new Course("AP Cybersecurity", "AP"));
        courses.add(new Course("Cybersecurity", "Elective"));
        courses.add(new Course("Digital Electronics", "Elective"));
        courses.add(new Course("Fundamentals of IT Infrastructure", "Elective"));
        courses.add(new Course("Mobile App Development", "Elective"));
        courses.add(new Course("Statics", "Elective"));
        courses.add(new Course("Web Development", "Elective"));
        courses.add(new Course("English", "Elective"));
        courses.add(new Course("AP Capstone Seminar", "AP"));
        courses.add(new Course("AP English Language and Composition", "AP"));
        courses.add(new Course("AP Capstone Research", "AP"));
        courses.add(new Course("Physical Education", "Elective"));
        courses.add(new Course("Mandarin", "Elective"));
        courses.add(new Course("AP Chinese Language and Culture", "AP"));
        courses.add(new Course("French", "Elective"));
        courses.add(new Course("AP French Language and Culture", "AP"));
        courses.add(new Course("German", "Elective"));
        courses.add(new Course("AP German Language and Culture", "AP"));
        courses.add(new Course("Italian", "Elective"));
        courses.add(new Course("AP Italian Language and Culture", "AP"));
        courses.add(new Course("Spanish", "Elective"));
        courses.add(new Course("AP Spanish Language and Culture", "AP"));
        courses.add(new Course("AP Spanish Literature and Culture", "AP"));
        courses.add(new Course("Algebra", "Regents"));
        courses.add(new Course("Geometry", "Regents"));
        courses.add(new Course("Pre-Calculus", "Elective"));
        courses.add(new Course("Calculus", "Elective"));
        courses.add(new Course("AP Calculus AB", "AP"));
        courses.add(new Course("AP Calculus BC", "AP"));
        courses.add(new Course("AP Statistics", "AP"));
        courses.add(new Course("Multivariable Calculus", "Elective"));
        courses.add(new Course("Linear Algebra", "Elective"));
        courses.add(new Course("Physics", "Regents"));
        courses.add(new Course("AP Physics 1", "AP"));
        courses.add(new Course("AP Physics 2", "AP"));
        courses.add(new Course("AP Physics C Mechanics", "AP"));
        courses.add(new Course("AP Physics C Electricity/Magnetism", "AP"));
        courses.add(new Course("Astronomy and Astrophysics", "Elective"));
        courses.add(new Course("Modern Physics", "Elective"));
        courses.add(new Course("Cultural Anthropology", "Elective"));
        courses.add(new Course("Dollars and Sense", "Elective"));
        courses.add(new Course("Economics", "Elective"));
        courses.add(new Course("Anthropology", "Elective"));
        courses.add(new Course("Sociology", "Elective"));
        courses.add(new Course("AP World History", "AP"));
        courses.add(new Course("AP US History", "AP"));
        courses.add(new Course("AP Human Geography", "AP"));
        courses.add(new Course("AP US Government and Politics", "AP"));
        courses.add(new Course("AP Comparative Government", "AP"));
        courses.add(new Course("AP Macroeconomics", "AP"));
        courses.add(new Course("AP Microeconomics", "AP"));
        courses.add(new Course("Civil Engineering and Architecture", "Elective"));
        courses.add(new Course("Principles of Engineering", "Elective"));
        courses.add(new Course("Flight School", "Elective"));
        courses.add(new Course("Aerospace Engineering", "Elective"));
        courses.add(new Course("Computer Integrated Manufacturing", "Elective"));
        courses.add(new Course("Concrete, Steel, and Soil", "Elective"));
        courses.add(new Course("Land Surveying", "Elective"));
        courses.add(new Course("Accounting", "Elective"));
        courses.add(new Course("AP Business with Personal Finance", "Elective"));
        courses.add(new Course("Product Design", "Elective"));
        courses.add(new Course("Methods of Fabrication", "Elective"));
        courses.add(new Course("Adobe Visual Design", "Elective"));
        courses.add(new Course("Criminal Law", "Elective"));
        courses.add(new Course("Constitutional Law", "Elective"));
        courses.add(new Course("Civil Law", "Elective"));
        courses.add(new Course("Pharmacy Organic Chemistry and Seminar", "Elective"));
        courses.add(new Course("Math Research with Computer Programming", "Elective"));
        courses.add(new Course("Graph Theory", "Elective"));
        courses.add(new Course("Number Theory", "Elective"));
        courses.add(new Course("Robotics", "Elective"));
        courses.add(new Course("Mechatronics", "Elective"));
        courses.add(new Course("Adobe Digital Video", "Elective"));
        courses.add(new Course("Digital Animation", "Elective"));
        courses.add(new Course("AP Studio Art", "AP"));
        return courses;
    }

    public String getCourseName() {
        return courseName;
    }

<<<<<<< HEAD
    public int getCourseID() {
        return courseID;
    }

    public String getCourseType() {
        return courseType;
    }
=======
    public String getCourseType() {
        return courseType;
    }

    public int getCourseID() {
        return courseID;
    }
>>>>>>> d6f8e6971353592b8601a1df30c97c2da7a06c03
}