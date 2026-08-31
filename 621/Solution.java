class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < tasks.length ; i++){
            if(map.containsKey(tasks[i])){
                map.put(tasks[i] , map.get(tasks[i])+1);
            }
            else{
                map.put(tasks[i] , 1);
            }
        }

        int maxFreq = 0;
        for(int freq : map.values()){
            maxFreq = Math.max(maxFreq , freq);
        }
        int count = 0;
        for(int freq  : map.values()){
            if(freq == maxFreq){
                count++;
            }
        }
        int result = (maxFreq - 1)*(n+1)+count;
        // return result;
        return Math.max(tasks.length, result);
    }
}