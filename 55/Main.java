public class Main {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if (i > maxReach) {
                return false;
            }
            int reach = i + nums[i];
            
            maxReach = Math.max(maxReach, reach);
            if (maxReach >= nums.length - 1) {
                return true;
            }

        }
        return false;
    }
}