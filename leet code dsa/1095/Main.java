
public class Main {
    static int findInMountainArray(int target, int[] mountainArr) {
        
        int peak = peakIndexInMountainArray(mountainArr);
        int firstHalf = binarySearch(mountainArr, target, 0, peak);
        int secondHalf = orderAgnostic(mountainArr, target, peak, mountainArr.length-1);
        if(firstHalf!=-1){
            return firstHalf;
        }
        return secondHalf;
    }
    static int peakIndexInMountainArray(int[] arr) {
       int start = 0;
       int end = arr.length-1; 
       
       while(start < end){
        int mid = start + (end-start)/2;
        if(arr[mid] > arr[mid+1]){
            end= mid;
        }
        else{
            start = mid+1;
        }
       }
       return start;
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
    static int orderAgnostic(int[] array , int target , int start , int end){
        
        while(start<=end){
            int mid = (start+end)/2;
            if(array[mid]==target){
                return mid;
            }
            if(array[start] < array[end]){
                if(array[mid]<target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(array[mid]<target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,3,1};
       int target = 3;
       int result = findInMountainArray(target, array); 
       System.out.println(result);
    }
}
