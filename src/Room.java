public class Room{
    private int RoomID;
    private String roomName = "";
    private static int counter = 1;
    public Room(String x){
        this.roomName = x;
        this.RoomID = counter;
        counter++;
    }
}