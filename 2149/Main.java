import java.util.*;

public class Main
{
    public static int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int[] new_nums = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
        }
        int posIndex = 0;
        int negIndex = 0;
        for(int i = 0; i < nums.length ; i++){
            if(i%2 == 0){
                new_nums[i] = pos.get(posIndex);
                posIndex++;
            }
            else{
                new_nums[i] = neg.get(negIndex);
                negIndex++;
            }
        }
        return new_nums;
    }
    

	public static void main(String[] args) {
	    int[] array = {-2,1,-3,4,-1,2,1,-5,4};
	    System.out.println(Arrays.toString(rearrangeArray(array)));
	    
	}
}