import java.util.ArrayList;

public class Rooms{

    private ArrayList<String> roomNumbers = new ArrayList<>();

    public Rooms(){
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
    }
    @Override
    public String toString() {
        String roomInserts = "";
        for(String s : roomNumbers){
            roomInserts += "INSERT INTO Rooms (RoomName) VALUES " + "(\""+s+"\")" + ";\n";
        }
        return roomInserts;
    }

}