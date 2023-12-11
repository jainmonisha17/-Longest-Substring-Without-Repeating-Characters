import java.util.*;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            ans = Math.max(ans, end - start + 1);
            end++;
        }
        return ans;
    }


        public static void main(String args[]) {
        String s = "takeUforward";
        System.out.println("The length of the longest substring without repeating characters is " + lengthOfLongestSubstring(s));

    }
}