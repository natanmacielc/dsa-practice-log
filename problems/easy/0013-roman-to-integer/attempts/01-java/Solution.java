class Solution {
    private static final int ALPHABET_SIZE = 'Y' - 'A';
    private static final int[] ROMAN_NUMERALS_TABLE = romanNumeralsTable();

    /**
     * Time Complexity: O(k)
     * Space Complexity: O(1)
     * @param s A string representing a value in the range [1, 3999] using only roman numerals.
     * @return The roman numeral converted into an integer.
     */
    public int romanToInt(String s) {
        int value = 0;
        int previous = 0;
        for (char character : s.toCharArray()) {
            int current = ROMAN_NUMERALS_TABLE[character - 'A'];
            if (previous < current) {
                value += current - previous * 2;
            } else {
                value += current;
            }
            previous = current;
        }
        return value;
    }

    private static int[] romanNumeralsTable() {
        int[] romanNumeralsTable = new int[ALPHABET_SIZE];
        romanNumeralsTable['I' - 'A'] = 1;
        romanNumeralsTable['V' - 'A'] = 5;
        romanNumeralsTable['X' - 'A'] = 10;
        romanNumeralsTable['L' - 'A'] = 50;
        romanNumeralsTable['C' - 'A'] = 100;
        romanNumeralsTable['D' - 'A'] = 500;
        romanNumeralsTable['M' - 'A'] = 1000;
        return romanNumeralsTable;
    }
}
