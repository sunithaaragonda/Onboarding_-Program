package corejava;
import java.util.HashSet;

public class Task04_HometaskString_01 {
    public static void main(String[] args) {
        String str = "programming";  // Example input
        findDuplicates(str);
    }

    public static void findDuplicates(String str) {
        HashSet<Character> seenChars = new HashSet<>();  // Set to store characters that we've seen
        HashSet<Character> duplicates = new HashSet<>();  // Set to store duplicate characters

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the character is already in 'seenChars', it's a duplicate
            if (seenChars.contains(c)) {
                duplicates.add(c);  // Add to duplicates set
            } else {
                seenChars.add(c);  // Otherwise, add it to 'seenChars'
            }
        }

        // Print out the duplicate characters
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate characters are: ");
            for (char c : duplicates) {
                System.out.println(c);
            }
        }
    }
}
