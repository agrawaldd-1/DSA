class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (num.containsKey(nums[i])) {
                num.put(nums[i], num.get(nums[i]) + 1);
            } else {
                num.put(nums[i], 1);
            }
        }
        int max = 1;
        for (Integer key : num.keySet()) {
            if (max < num.get(key)) {
                return true;
            }
        }
        return false;
    }
}
