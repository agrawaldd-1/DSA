public class Main
{
    public static int maxProfit(int[] prices) {
        int maxProfits = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] > prices[i-1]){
                maxProfits += prices[i]-prices[i-1];
            }
        }
        return maxProfits;
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] prices = {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}
}