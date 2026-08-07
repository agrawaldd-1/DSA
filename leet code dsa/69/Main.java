public class Main{
    static  int mySqrt(int x) {
        if(x <= 0){
            return 0;
        }        
        int start = 0;
        int end = x;
        while(start <= end){
            int mid = (start + end) / 2;
            long sqr = (long)mid*mid;
            if(sqr == x){
                return mid;
            }
            if(sqr > x){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int num = 106;
        System.out.println(mySqrt(num));
    }
}