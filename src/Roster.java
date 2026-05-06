public class Roster {
    private int rosterID;
    private Roster roster;

    public Roster(Roster roster, String student, int studentID) {
        this.rosterID = rosterID;
         this.roster = roster;

         int arr1 = Integer.parseInt((String) student);
    }

    public int getRosterID() {
        return rosterID;
    }
}