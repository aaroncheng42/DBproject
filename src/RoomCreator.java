import java.util.ArrayList;

public class RoomCreator{

    private ArrayList<String> roomNumbers = new ArrayList<>();
    private ArrayList<Room> li = new ArrayList<>();
    public RoomCreator(){
        String room = "";
        String floor = "";
        String direction = "N";
        for (int i = 0; i < 4; i++) {
            if (i == 1) {
                direction = "E";
            } else if (i == 2) {
                direction = "S";
            } else if (i == 3) {
                direction = "W";
            }
            for (int p = 0; p < 9; p++) {
                if (p == 0) {
                    floor = "B";
                } else {
                    floor = String.valueOf(p);
                }
                for (int j = 1; j < 21; j++) {
                    room = String.valueOf(j);
                    // ts for testing System.out.print("" + floor + direction + room + ",");
                    roomNumbers.add(floor + direction + room);
                }
            }
        }
        for(String i : roomNumbers){
            li.add(new Room(i));
        }
    }
    @Override
    public String toString() {
        String roomInserts = "";
        for(String s : roomNumbers){
            roomInserts += "INSERT INTO Rooms (RoomName) VALUES " + "(\""+s+"\")" + ";\n";
        }
        return roomInserts;
    }
    public ArrayList<Room> getRoomRefs() {
        return li;
    }

}