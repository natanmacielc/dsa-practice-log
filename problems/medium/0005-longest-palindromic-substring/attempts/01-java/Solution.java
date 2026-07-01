public class Solution {
    /**
     * Start verifying if the character string is null or blank. If it is, then return a blank string.
     * If it is not null or blank, then start to search the longest palindrome expanding from the center, only checking if the left and right character are equals, then return the length of the longest palindrome found.
     * The even and odd longest palindrome length found is compared, and only the longest between these two will be used.
     * Then compare if the current palindrome length is greater than the previous one, if it exists, if is greater, then the values from the start and end variables will be replaced.
     * At the end of iteration over the character string, then return the substring of the longest palindrome found.
     * Example:
     * Input: "bsabab"
     * Output: "aba" or "bab"
     * Time Complexity: O(n * n)
     * Space Complexity: O(1)
     * @param s A character string to evaluate its longest palindrome.
     * @return The longest palindrome in the character string.
     */
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            } 
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
