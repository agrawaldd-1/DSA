class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> f = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(f.containsKey(nums[i])){
                f.put(nums[i], f.get(nums[i]) + 1);
            }else{
                f.put(nums[i], 1);
            }
        }
        int m = 0;
        for (Integer key : f.keySet()) {
            if(m < f.get(key)){
                m = f.get(key);
            }
        }
        int c = 0;
        for (Integer key : f.keySet()) {
            if(m == f.get(key)){
                c++;
            }
        }
        return c*m;
    }
}