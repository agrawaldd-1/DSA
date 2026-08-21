class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String , List<String>> word = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!word.containsKey(key)){
                word.put(key , new ArrayList<>());
            }
            word.get(key).add(str);

        }
        return new ArrayList<>(word.values());

    }
}