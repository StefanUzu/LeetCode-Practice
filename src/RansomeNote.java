import java.util.HashMap;
import java.util.Map;

public class RansomeNote {
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new HashMap<>();
        for (char c :ransomNote.toCharArray()) {
            ransomMap.put(c , ransomMap.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (char c :magazine.toCharArray()) {
            magazineMap.put(c , magazineMap.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomMap.keySet()) {
            if (magazineMap.containsKey(c) && magazineMap.get(c) >= ransomMap.get(c) ) {
                continue;
            }
            return false;
        }
        return true;
    }
}
