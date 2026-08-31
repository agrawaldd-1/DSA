class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int maxReach = 0;
        int jump = 0;
        int end = 0;
        for(int i = 0 ; i < nums.length ; i++){
            maxReach = Math.max(maxReach , i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return jump + 1;
            }
            if(i == end){
                jump++;
                end = maxReach;
            }
        }
        return jump;   
    }
}