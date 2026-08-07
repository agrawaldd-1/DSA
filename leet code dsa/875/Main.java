public class Main {
      static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 1;
        for(int pile : piles){
            end = Math.max(end,pile);
        }
        while(start < end){
            int mid = start + (end-start)/2;
            if(isPossible(piles , h , mid)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    static boolean isPossible(int[] piles , int h , int k){
        int total = 0;
        for(int pile : piles){
        total += (pile + k-1)/k;   
        }
        return total <= h;
    }
    
    public static void main(String[] args){
        int[] piles = {3,6,7,11};
        int hours = 8;

        System.out.println(minEatingSpeed(piles , hours));
    }
}
