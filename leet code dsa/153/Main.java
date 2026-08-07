public class Main {
    static int findMin(int[] nums) {
        int pivot = findPivot(nums);
        int result = 0;
        if(pivot == nums.length){
            result = 0;
        }
        else{
            result = pivot+1;
        }
        return result;
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {11,13,15,17};
        int result = findMin(array);
        System.out.println(result);
    }
}