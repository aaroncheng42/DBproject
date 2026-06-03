public class Roster {
    private Roster roster;
    private int[] studentID;
    private Student[] students;

    public Roster(Roster roster, Student[] students) {
        this.roster = roster;
        this.students = students;
        for (int studentIndex = 0; studentIndex < students.length; studentIndex++) {
            studentID[studentIndex] = students[studentIndex].getStudentID();
        }
    }
}
