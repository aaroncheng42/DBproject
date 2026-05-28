public class Offering {
    private int period;
    private int offeringID = 0;
    private Assignment[] assignments;
    private Teacher teacher;
    static int counter = 1;
    private Roster roster;
    private Course course;


    public Offering(int period, Assignment[] assignments, Course course, Teacher teacher, Roster roster) {
        this.period = period;
        this.assignments = assignments;
        int count = 0;
        this.teacher = teacher;
        this.roster = roster;
        offeringID = counter;
        counter++;
        this.course = course;
    }


    public int getOfferingID() {
        return offeringID;
    }


    public int getPeriod() {
        return period;
    }


    public Assignment[] getAssignments() {
        return assignments;
    }

}


