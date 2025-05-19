package InterviewCoding;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeat {
    public static void main(String[] args) {
        maxRepeat("Hello");
    }
    public static void maxRepeat(@NotNull String str) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Max repeated character: '" + maxChar + "' occurred " + maxCount + " times.");
    }

}