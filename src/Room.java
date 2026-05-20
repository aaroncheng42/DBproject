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
        return "INSERT INTO Rooms (room) VALUES ('" + getRoomName() + "');";
    }

    public static ArrayList<Room> getRooms() throws FileNotFoundException {
        ArrayList<Room> rooms = new ArrayList<>();
        Scanner scanner = new Scanner(new File("rooms.txt"));

        while (scanner.hasNextLine()) {
            String roomName = scanner.nextLine();
            rooms.add(new Room(roomName));
        }

        scanner.close();
        return rooms;
    }

    public String getRoomName() {
        return roomName;
    }
}