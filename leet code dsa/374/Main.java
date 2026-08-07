public class Main {
    static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end-start)/2;
            int pick = guess(mid);
            if(pick == 0){
                return mid;
            }
            if(pick == 1){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return 0;
    }
}