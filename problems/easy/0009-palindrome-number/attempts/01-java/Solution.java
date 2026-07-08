class Solution {
    /**
     * Reverse only the second half of the number and compare it to the first half.
     * Negative numbers and numbers ending in 0 (except 0 itself) are never palindromes.
     * Time Complexity:  O(log n)
     * Space Complexity: O(1)
     *
     * @param  x the integer to check
     * @return true if x is a palindrome
     */
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverted = 0;
        while (x > reverted) {
            reverted = reverted * 10 + x % 10;
            x /= 10;
        }

        // Even digit count: x == reverted
        // Odd digit count: middle digit is discarded via reverted / 10
        return x == reverted || x == reverted / 10;
    }
}
