import java.util.Arrays;

public class Main
{
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void nextPermutation(int[] nums) {
        int index = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(nums , 0 , nums.length-1);
            return;
        }
        for(int i = nums.length-1;i>index;i++){
            if(nums[index]<nums[i]){
                swap(nums , i , index);
                break;
            }
        }
        reverse(nums , index+1 , nums.length-1);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] nums = {1,3,2};
		nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}
}