class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        if(p.length() > s.length()) return result;

        for(int i = 0; i < p.length(); i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }

        int size = p.length();

        for(int i = 0; i < size; i++){
            windowMap.put(s.charAt(i), windowMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        if(map.equals(windowMap)) result.add(0);

        for(int i = size; i < s.length(); i++){
            char outgoing = s.charAt(i - size);
            char incoming = s.charAt(i);

            if(windowMap.get(outgoing) == 1){
                windowMap.remove(outgoing);
            } else {
                windowMap.put(outgoing, windowMap.get(outgoing) - 1);
            }

            windowMap.put(incoming, windowMap.getOrDefault(incoming, 0) + 1);

            if(map.equals(windowMap)){
                result.add(i - size + 1);
            }
        }

        return result;
    }
}