public class Main {
    public String frequencySort(String s) {
        Pair[] freq = new Pair[26];   
        for(int i = 0 ; i< s.length ; i++){
            freq[i] = new Pair(0,char(i+'a'));
        };
        for(char ch : s.toCharArray()){
            freq[ch - 'a'].freq++;
        }
        for(Pair p : freq){
            if(p.freq>0) result add(p.ch);
        }
    }
}
