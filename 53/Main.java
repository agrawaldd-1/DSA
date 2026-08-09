
public class Main
{
    public static int maxSubArray(int[] nums) {
        int current = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            current = current+nums[i];
            maxSum = Math.max(maxSum , current);
            if(current < 0){
            current = 0;
        }
        }
        
        return maxSum;
    }
    

	public static void main(String[] args) {
	    int[] array = {-2,1,-3,4,-1,2,1,-5,4};
	    System.out.println(maxSubArray(array));
	    
	}
}