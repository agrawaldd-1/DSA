// import java.util.HashSet;

public class Main
{
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfits = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            int profit = prices[i]-minPrice;
            maxProfits = Math.max(maxProfits , profit);
        }
        return maxProfits;
    }
    
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int[] array = {7,1,5,3,6,4};
        System.out.println(maxProfit(array));
	}
}