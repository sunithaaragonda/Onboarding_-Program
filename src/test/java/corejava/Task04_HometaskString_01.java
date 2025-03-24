package corejava;
import java.util.HashSet;

public class Task04_HometaskString_01 {
    public static void main(String[] args) {
        String str = "programming";  
        findDuplicates(str);
    }

    public static void findDuplicates(String str) {
        HashSet<Character> seenChars = new HashSet<>();  
        HashSet<Character> duplicates = new HashSet<>();  

       
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

          
            if (seenChars.contains(c)) {
                duplicates.add(c);  
            } else {
                seenChars.add(c);  
            }
        }

      
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
