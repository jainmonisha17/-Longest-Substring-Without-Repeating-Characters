import java.util.*;

class longestSubstringLength {

public static int solve(String givenString) {
    if(givenString.length() == 0 || givenString.length() == 1) {
        return givenString.length();
    }

    int length = Integer.MIN_VALUE;

    HashSet<Character> mySet = new HashSet<>();
    for(int i = 0; i < givenString.length(); i++) {
        for(int j = i; j < givenString.length(); j++)   {
            if(mySet.contains(givenString.charAt(j))) {
                length = Math.max(length, j - i + 1);
            }
            mySet.add(givenString.charAt(j));
        }
    }

    return length;
}

    public static void main(String args[]) {
        String str = "takeUforward";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));

    }
}

// we can take i and j pointers as left and right pointers

// tc -> O(N ^ 2) for using two pointers i and j
// sc -> O(N)