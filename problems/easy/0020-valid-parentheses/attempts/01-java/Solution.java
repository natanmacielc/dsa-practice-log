import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    private static final char[] BRACKET_TABLE = bracketTable();
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param s A string containing just: (, ), {, }, [ and ].
     * @return If the string s is valid. The string is only valid if open brackets are closed by the same type of brackets and they're in the correct order.
     */
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (BRACKET_TABLE[current] != '\0') {
                stack.push(BRACKET_TABLE[current]);
            } else if (stack.isEmpty() || current != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static char[] bracketTable() {
        char[] table = new char[128];
        table['{'] = '}';
        table['('] = ')';
        table['['] = ']';
        return table;
    }
}
