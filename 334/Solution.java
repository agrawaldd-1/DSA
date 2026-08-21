class Solution {
    public boolean increasingTriplet(int[] nums) {
        // int small = 0;
        int mid = 1;
        int large = 2;

        for(int i = 0;i<=nums.length-3;i++){
            if(nums[i] < nums[mid] && nums[mid] < nums[large]){
                return true;
            }
            else{mid++;
            large++;}
        }
        return false;    
    }
}