class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < k ; i++){
            sum = sum + nums[i];
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }
        if (map.size() == k) {
            max = sum;
        }
        for(int i = k ; i < nums.length ; i++){
            int outgoing = nums[i-k];

            sum -= outgoing;
            map.put(outgoing, map.get(outgoing) - 1);

            if(map.get(outgoing) == 0){
                map.remove(outgoing);
            }

            int incoming = nums[i];
            sum += incoming;
            map.put(incoming, map.getOrDefault(incoming, 0) + 1);

            if(map.size() == k){
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}