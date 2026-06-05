import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Room{
    private int roomID;
    private String roomName = "";
    private static int counter = 1;

    public Room(String r){
        roomName = r;
        roomID = ++counter;
    }

    public String toString() {
        return "INSERT INTO Rooms (RoomName) VALUES ('" + getRoomName() + "');\n";
    }

    public int getRoomID() {
        return roomID;
    }

    public static ArrayList<Room> getRooms() throws FileNotFoundException {
        counter = 0;
        ArrayList<Room> rooms = new ArrayList<>();
        Scanner scanner = new Scanner(new File("/home/keruic3/Projects/database/src/files/rooms.txt"));

        while (scanner.hasNextLine()) {
            String roomName = scanner.nextLine();
            rooms.add(new Room(roomName));
        }

        scanner.close();
        return rooms;
    }

    public static void printRooms() throws FileNotFoundException {
        ArrayList<Room> rooms = Room.getRooms();

        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(rooms.get(i).toString());
        }
    }

    public String getRoomName() {
        return roomName;
    }
}