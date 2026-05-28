public class Roster {
    private int rosterID;
    private Roster roster;
    private int[] studentID;
    private Student[] students;

    public Roster(Roster roster, Student[] students) {
        this.rosterID = rosterID;
        this.roster = roster;
        this.students = students;
        for (int studentIndex = 0; studentIndex < students.length; studentIndex++) {
            studentID[studentIndex] = students[studentIndex].getStudentID();
        }
    }

    public int getRosterID() {
        return rosterID;
    }
}
