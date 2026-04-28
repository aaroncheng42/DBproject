public class Rooms{
    public static String Room_Creation(){
        System.out.println("Current folder: " + System.getProperty("user.dir"));
        String roomList = "";
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
                    roomList += floor + direction + room + ",";
                }
            }
        }
        return roomList;
    }
}