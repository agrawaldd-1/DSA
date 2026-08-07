import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    static List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        bubble(nums);
        for (int i = 0 ; i < nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum > 0 ){
                    right--;
                }
                else if(sum < 0 ){
                    left++;
                }
                else{
                    while(left < right &&nums[left] == nums[left+1]){
                        left++;
                    }
                    while(right > 0  && nums[right] == nums[right-1]){
                        right--;
                    }
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
            }
            
        } 
        return result;
    }
    static void bubble(int[]array){
        for(int i = 0 ; i<array.length;i++){
            for(int j = 1;j<array.length;j++){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    
    public static void main (String[] args) {
        int[] array = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(array);
        System.out.println(result);
    }
}