class Solution {
    private static final int ABSENT = -1;
    /**
     * Slide a window of needle's length across haystack, checking each
     * position with String.startsWith.
     * Time Complexity:  O(n*m)
     * Space Complexity: O(1)
     *
     * @param  haystack string to search within
     * @param  needle   substring to search for
     * @return index of the first occurrence of needle, or -1 if absent
     */
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return ABSENT;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return ABSENT;
    }
}
