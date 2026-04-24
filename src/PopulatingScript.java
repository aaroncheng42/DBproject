import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class PopulatingScript {

    public PopulatingScript() {
    }
    public void Room_Creation() throws IOException {
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
        // this doesnt work VVV
        Path path = Path.of("rooms.txt");
        Files.writeString(path, roomList, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

    public void Assignment_Creation() {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        hashMap.put("Learning Addition", false);
        hashMap.put("Learning Subtraction", false);
        hashMap.put("Learning Multiplication", false);
        hashMap.put("Learning Cooking", false);
        hashMap.put("Learning Times Tables", false);
        hashMap.put("Learning Square Roots", false);
        hashMap.put("Learning Exponents", false);
        hashMap.put("Learning Division", false);
        hashMap.put("MP1 Math Test", true);
        hashMap.put("Learning Reflections", false);
        hashMap.put("Learning About Mirrors", false);
        hashMap.put("Learning About Waves", false);
        hashMap.put("Learning About Parabolas", false);
        hashMap.put("Learning Graphing", false);
        hashMap.put("Learning Cube Roots", false);
        hashMap.put("Learning Square Times Tables", false);
        hashMap.put("Learning Buisness", false);
        hashMap.put("Learning Supply and Demand", false);
        hashMap.put("Learning How to Make Money", false);
        hashMap.put("MP1 Buisness Test", true);
        hashMap.put("Learning Scratch", false);
        hashMap.put("Learning Java", false);
        hashMap.put("Learning Iterations", false);
        hashMap.put("Learning About If Statements", false);
        hashMap.put("Learning Hashmaps", false);
        hashMap.put("Learning For Statements", false);
        hashMap.put("Learning Arrays", false);
        hashMap.put("Learning 2D Arrays", false);
        hashMap.put("Learning Recursion", false);
        hashMap.put("Learning Strings", false);
        hashMap.put("MP1 CSP Test", true);

// Iterate through the HashMap
        for (Map.Entry<String, Boolean> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            // someone who knows how to insert ts (this) into a file (Assignments) should do it
        }
    }
}