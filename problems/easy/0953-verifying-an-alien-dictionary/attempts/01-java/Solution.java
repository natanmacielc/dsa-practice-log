import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Maps each alien letter to its rank in `order`, then checks each adjacent
     * word pair follows that rank (and that a longer word never precedes its
     * own prefix).
     * Time Complexity:  O(C) where C is the total length of all words
     * Space Complexity: O(1) — at most 26 letters in the rank map
     *
     * @param  words the list of words to check
     * @param  order the alien alphabet's letter order
     * @return true if words is sorted lexicographically per order
     */
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> orderOf = new HashMap<>(order.length());
        for (int i = 0; i < order.length(); i++) {
            orderOf.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            String first = words[i], second = words[i + 1];
            if (first.length() > second.length() && first.startsWith(second)) return false;
            int minLength = Math.min(first.length(), second.length());

            for (int j = 0; j < minLength; j++) {
                int firstOrder = orderOf.get(first.charAt(j)), secondOrder = orderOf.get(second.charAt(j));
                if (firstOrder < secondOrder) {
                    break;
                } else if (firstOrder > secondOrder) {
                    return false;
                }
            }
        }

        return true;
    }
}
