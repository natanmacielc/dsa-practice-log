class Solution {
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param s A string that consists only of printable ASCII characters.
     * @return If the string s is a valid palindrome after converting all its uppercase letter into lowercase letter and removing all non-alphanumeric characters.
     */
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !isAlphanumeric(s.charAt(left)))
                left++;
            while (left < right && !isAlphanumeric(s.charAt(right)))
                right--;
            if (toLower(s.charAt(left)) != toLower(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private char toLower(char c) {
        return (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
    }
}