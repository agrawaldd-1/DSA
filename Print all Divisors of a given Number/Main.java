import java.util.*;

public class Main
{
    public static List<Integer> divisors(int n) { 
        List<Integer> res = new ArrayList<>();
        
        // Loop must start at 1 to avoid division by zero
        for (int i = 1; i <= n; i++) { 
            if (n % i == 0) {
                res.add(i);
            }
        } // The loop must fully close before returning the result
        
        return res; 
    }
	public static void main(String[] args) {
		System.out.println(divisors(36));
		
	}
}