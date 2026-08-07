

public class Main {
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int firstHalf  = binarySearch(nums, target, 0, pivot);
        int secondHalf = binarySearch(nums, target, pivot+1, nums.length-1);

        if(firstHalf != -1){
            return firstHalf;
        }
        else return secondHalf;
    }
    static int findPivot(int[] array){
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid  = start + (end-start)/2;
            if(mid < end && array[mid] > array[mid+1]){
                return mid;
            }
            if(mid > start && array[mid] < array[mid-1]){
                return mid-1;
            }
            if(array[mid] <= array[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;
    }
    static int binarySearch(int[] array , int target , int left  , int right){
        if(array.length == 0){
            return -1;
        }
        
        while(left <= right){
            int mid = (left + right)/2;
            if(array[mid] == target){
                return mid;
            }
            if(array[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2,3};
        int target = 0;
        int result = search(array, target);
        System.out.println(result);
    }
}
