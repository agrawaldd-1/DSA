public class Main{
    static int firstOccurance(int[] arr , int n){
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == n){
                result = mid;
                end = mid-1;
            }
            else if(arr[mid] < n){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return result;
    }
    static int lastOccurance(int[] arr , int n){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<= end){
            int mid = start+ (end-start)/2;

            if(arr[mid] == n){
                result = mid;
                start = mid+1;
            }
            else if(arr[mid] > n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return result;
    }

    static int count(int[] arr , int num){
        int first = firstOccurance(arr, num);
        int last = lastOccurance(arr, num);
        if(first == -1 ){
            return 0;
        }
        return last-first+1;
    }
}