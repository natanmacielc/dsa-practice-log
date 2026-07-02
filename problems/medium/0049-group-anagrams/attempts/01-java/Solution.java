import java.util.*;

class Solution {
    private static final int LETTERS_QUANTITY = 26;

    /**
     * Create a HashMap to store the signature of every string in the array as a key, mapping them with the list of anagrams as a value.
     * A signature consists of the number of occurrences of every letter from alphabet, transforming it into an array of chars and a string in the end.
     * Iterate over the array of string, mapping them all into the HashMap.
     * At the end of iteration, return all values inside the HashMap.
     * Time Complexity: O(n * k) — read every character of every string once
     * Space Complexity: O(n) — n signatures, each of fixed size 26 (constant, independent of k)
     * @param strs An array of strings, the strings consists of lowercase English letters and the length is greater than one;
     * @return A list of grouped anagrams in any order.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(strs.length);
        for (String s : strs) {
            map.computeIfAbsent(getAnagramSignature(s), key -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private String getAnagramSignature(String s) {
        int[] letters = new int[LETTERS_QUANTITY];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        char[] signature = new char[LETTERS_QUANTITY];
        for (int i = 0; i < LETTERS_QUANTITY; i++) {
            signature[i] = (char) letters[i];
        }
        return new String(signature);
    }
}
