import java.util.HashMap;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int a : nums1) {
            for (int b : nums2) {
                int sumA_B = a + b;
                map.put(sumA_B, map.getOrDefault(sumA_B, 0) + 1);
            }
        }
        
        int answer = 0;
        for (int c : nums3) {
            for (int d : nums4) {
                int sumC_D = c + d;
                int result = -(sumC_D);
                if (map.containsKey(result)) {
                    answer += map.get(result);
                }
            }
        }
        
        return answer;
    }
}
