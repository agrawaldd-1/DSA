public class Main
{   
    public static int minBitFlips(int start, int goal) {
        int result =  start^goal;
        int count = 0;
        while(result > 0){
            result = result & result-1;
            count++;
            
        }
        return count;
    }
	public static void main(String[] args) {
// 		System.out.println("Hello World");
    int start = 3;
    int goal = 4;
    System.out.println(minBitFlips(start,goal));
	}
}