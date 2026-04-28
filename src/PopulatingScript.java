import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class PopulatingScript {

    public PopulatingScript() {
    }
    public void start(){
        RoomCreator r = new RoomCreator();
        System.out.println(r);
        HashMap<String, Boolean> assignmentMap = Assignment.Assignment_Creation();
        for (Map.Entry<String, Boolean> entry : assignmentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            // someone who knows how to insert ts (this) into a file (Assignments) should do it
        }
    }
    
}