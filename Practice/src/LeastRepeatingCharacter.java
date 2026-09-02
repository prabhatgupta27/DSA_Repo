import java.util.LinkedHashMap;
import java.util.Map;

public class LeastRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbccddeeffg";
        char firstNonRepeatedChar = findFirstNonRepeatedChar(str);
        System.out.println("First non-repeated character: " + firstNonRepeatedChar);
    }

    public static char findFirstNonRepeatedChar(String str) {
        // Create a LinkedHashMap to maintain the order of characters
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        str.chars().forEach(ch -> charCountMap.put((char) ch, charCountMap.getOrDefault((char) ch, 0) + 1));

        // Find the first character with count 1
        return charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('\0'); // Return '\0' if no non-repeated character is found
    }
}