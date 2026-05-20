public class Offering {
    private int offeringID;
    private static int counter = 0;

    public Offering() {
        offeringID = ++counter;
    }

    public int getOfferingID() {
        return offeringID;
    }
}

