class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;

        for(int i = 0 ; i < k ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }
        max = count;
        for(int i = k ; i < s.length(); i++){
            char oldCh = s.charAt(i-k);
            char newCh = s.charAt(i);
            if(oldCh == 'a' || oldCh == 'e' || oldCh == 'i' || oldCh == 'o' || oldCh == 'u') count--;
            if(newCh == 'a' || newCh == 'e' || newCh == 'i' || newCh == 'o' || newCh == 'u') count++;
            if(count > max) max = count;
        }
        return max;

    }
}