public class Main{
    static int arrangeCoins(int n) {
        int start = 1;
        int end = n;

        while(start<=end){
            int mid = start + (end-start)/2;
            long coins = (long)mid*(mid+1)/2;

            if(coins == n){
                return mid;
            }
            if(coins > n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println(arrangeCoins(number));
    }
}