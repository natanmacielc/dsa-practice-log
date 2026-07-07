class Solution {
    /**
     * Take the first string as the candidate prefix, then walk each remaining
     * string, shrinking the prefix end (`last`) to the last index that still
     * matches character-for-character. Stop early once the prefix is empty.
     * Time Complexity:  O(n * m)  n = number of strings, m = shortest length
     * Space Complexity: O(m)      char[] copy of the first string
     *
     * @param  strs array of strings
     * @return the longest common prefix, or "" if none
     */
    public String longestCommonPrefix(String[] strs) {
        char[] match = strs[0].toCharArray();
        int last = match.length - 1;
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            last = Math.min(current.length() - 1, last);
            for (int k = 0; k < current.length() && k <= last; k++) {
                if (current.charAt(k) != match[k]) {
                    last = k - 1;
                    break;
                }
            }
            if (last == -1) {
                break;
            }
        }
        return new String(match, 0, last + 1);
    }
}
