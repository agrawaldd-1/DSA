public class Main
{
    public static int longestSubarray(int[] nums, int k) {
        int maxLength = 0; 

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) { 
                sum += nums[j]; 
                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] array = {1,1,1};
		int target = 2;
		System.out.println(longestSubarray(array , target));
		
	}
}