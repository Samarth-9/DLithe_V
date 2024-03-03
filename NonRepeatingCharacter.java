import java.util.HashMap;

public class NonRepeatingCharacter {
    public static char nonrepeatingCharacter(String S) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count frequency of each character
        for (char c : S.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first non-repeating character
        for (char c : S.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }
        
        // If no non-repeating character found, return '$'
        return '$';
    }

    public static void main(String[] args) {
        String input1 = "hello";
        System.out.println("Example 1:");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + nonrepeatingCharacter(input1));
        
        String input2 = "zxvczbtxyzvy";
        System.out.println("\nExample 2:");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + nonrepeatingCharacter(input2));
    }
}
