class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> ch = new HashMap<>();

        // Frequency count
        for (int i = 0; i < s.length(); i++) {

            if (ch.containsKey(s.charAt(i))) {
                ch.put(s.charAt(i), ch.get(s.charAt(i)) + 1);
            } else {
                ch.put(s.charAt(i), 1);
            }
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (ch.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}