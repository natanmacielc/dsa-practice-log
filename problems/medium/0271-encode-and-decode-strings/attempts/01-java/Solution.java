import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Length-prefix encoding: each string is written as "<length>#<string>".
     * Decoding reads digits up to the '#' to know exactly how many characters
     * to take, so the strings themselves may contain any character (even '#').
     * Time Complexity:  O(n) — n = total characters across all strings
     * Space Complexity: O(n) — for the encoded string / decoded list
     */
    private static final char DELIMITER = '#';

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append(DELIMITER).append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length();) {
            int j = i;
            while (str.charAt(j) != DELIMITER) {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            int start = j + 1;
            list.add(str.substring(start, start + len));
            i = start + len;
        }
        return list;
    }
}
