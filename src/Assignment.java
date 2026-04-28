import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class Assignment{
    public static HashMap<String, Boolean> Assignment_Creation() {
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
        return hashMap;
    }
}