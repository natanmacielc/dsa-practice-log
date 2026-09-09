import java.util.HashSet;
import java.util.Set;

class Solution {
    /**
     * Generates a small set of palindrome candidates and picks the closest.
     * Candidates: the digit-length boundary palindromes (all 9s one digit
     * shorter, and 100...01 one digit longer), plus the palindrome built by
     * mirroring the input's first half and mirroring (first half ± 1) to
     * handle carries/borrows across the middle.
     * Time Complexity:  O(len) to build each candidate
     * Space Complexity: O(len) for the candidate strings
     *
     * @param  n the input number as a string
     * @return the nearest palindrome to n (not equal to n itself)
     */
    public String nearestPalindromic(String n) {
        int len = n.length();
        long num = Long.parseLong(n);

        // Edge case: single digit — closest palindrome is always num - 1
        // (every single digit is itself a palindrome, so we must move off it)
        if (len == 1) {
            return String.valueOf(num - 1);
        }

        Set<Long> candidates = new HashSet<>();

        // Candidate 1 & 2: boundary cases when crossing digit-length
        // e.g. len=3 -> "99" (10^2 - 1) and "1001" (10^3 + 1)
        candidates.add((long) Math.pow(10, len - 1) - 1);
        candidates.add((long) Math.pow(10, len) + 1);

        // Take the first half (including the middle digit for odd length)
        int prefixLen = (len + 1) / 2;
        long prefix = Long.parseLong(n.substring(0, prefixLen));

        // Candidate 3, 4, 5: mirror prefix, mirror(prefix+1), mirror(prefix-1)
        for (long p : new long[]{prefix - 1, prefix, prefix + 1}) {
            candidates.add(buildPalindrome(p, len));
        }

        candidates.remove(num); // must not equal n itself

        long result = -1;
        for (long candidate : candidates) {
            if (result == -1) {
                result = candidate;
                continue;
            }
            long diff = Math.abs(candidate - num);
            long bestDiff = Math.abs(result - num);
            if (diff < bestDiff || (diff == bestDiff && candidate < result)) {
                result = candidate;
            }
        }

        return String.valueOf(result);
    }

    // Given a prefix and the target total length, mirror the prefix to build a full palindrome
    private long buildPalindrome(long prefix, int totalLen) {
        String prefixStr = String.valueOf(prefix);
        StringBuilder sb = new StringBuilder(prefixStr);

        // mirror: if totalLen is odd, skip the last char of prefix when reversing (it's the middle)
        int mirrorStart = (totalLen % 2 == 0) ? prefixStr.length() - 1 : prefixStr.length() - 2;
        for (int i = mirrorStart; i >= 0; i--) {
            sb.append(prefixStr.charAt(i));
        }

        return Long.parseLong(sb.toString());
    }
}
