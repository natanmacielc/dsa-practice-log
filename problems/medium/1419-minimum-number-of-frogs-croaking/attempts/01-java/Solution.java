class Solution {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] letterCount = new int[5];
        int activeFrogs = 0, maxActiveFrogs = 0;

        for (int i = 0; i < croakOfFrogs.length(); i++) {
            char ch = croakOfFrogs.charAt(i);
            int letterIndex = "croak".indexOf(ch);
            letterCount[letterIndex]++;

            if (letterIndex == 0) {
                maxActiveFrogs = Math.max(maxActiveFrogs, ++activeFrogs);
            } else if (--letterCount[letterIndex - 1] < 0) {
                return -1;
            } else if (letterIndex == 4) {
                activeFrogs--;
            }
        }

        return activeFrogs == 0 ? maxActiveFrogs : -1;
    }
}
