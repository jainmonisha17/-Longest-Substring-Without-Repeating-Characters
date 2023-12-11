import java.util.*;

public class longestSubstringLengthOptimized {
    
    public static int longestSubstring(String s) {

        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();

        int left = 0;
        int right = 0;
        int n = s.length();
        int length = 0;

        while(right < s.length()) {
            if(myMap.containsKey(s.charAt(right))) {   // repeating
                left = Math.max(myMap.get(s.charAt(right)) + 1, left);
            }
            myMap.put(s.charAt(right), right);  // ch, index
            length = Math.max(length, right - left + 1);   // last length or updated range
            right++;
        }
        return length;
    }

    public static void main(String args[]) {
        String s = "takeUforward";
        System.out.println("The length of the longest substring without repeating characters is " + longestSubstring(s));

    }
}
