package Day3;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println("First non-repeating character index: " + firstUniqChar(s));
    }
}