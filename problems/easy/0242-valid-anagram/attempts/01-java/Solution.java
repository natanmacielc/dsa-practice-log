public class Solution {
    private static final int ENGLISH_LETTERS = 26;
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param s A string to compare with another one.
     * @param t Another string to compare with the first one.
     * @return If t is an anagram of s.
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[ENGLISH_LETTERS];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
