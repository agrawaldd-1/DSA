class Solution {
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 ,-1);
        int remainder = 0;
        for (int num : nums) {
            remainder = (remainder + num) % p;
        }
        if(remainder == 0) return 0;

        int prefixSum = 0;
        int minLen = nums.length;
        for(int i = 0; i < nums.length ; i++){
            prefixSum = (prefixSum+nums[i])%p;
            // int currentRemainder = prefixSum % p;
            int needed = (prefixSum - remainder +p)%p;
            if(map.containsKey(needed)){
                minLen = Math.min(minLen , i-map.get(needed));
            }
            map.put(prefixSum, i);
        }
        return minLen == nums.length ? -1 : minLen;
    }
}