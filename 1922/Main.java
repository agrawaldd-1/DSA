public class Main
{
    static final int MOD = 1_000_000_007;
    public static int countGoodNumbers(long n) {
        long evenSide = (n+1)/2;
        long oddSide = (n)/2;
        // return (int)(power(5,evenSide)*power(4,oddSide))%MOD;
        long result = (power(5, evenSide) * power(4, oddSide)) % MOD;
        return (int) result;
    }
    static long power(long x, long y) {
        if(y == 0){
            return 1;
        }
        long half = power(x , y/2);
        if(y%2 ==0){
            return (half * half)%MOD;
        }
        
        return (x*half*half)%MOD;
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(countGoodNumbers(50));
	}
}