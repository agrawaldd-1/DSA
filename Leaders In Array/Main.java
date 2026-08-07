import java.util.*;

public class Main
{
    public static List<Integer> leaders(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int max = nums[nums.length-1];
        res.add(max);
        for(int i = nums.length-2;i>= 0 ; i--){
            if(nums[i] > max){
                max = nums[i];
                res.add(max);
            }
        }
        Collections.reverse(res);
        return res;
    }
	public static void main(String[] args) {
// 		System.out.println("Hello World");
		int[] array = {10, 22, 12, 3, 0, 6};
		System.out.println(leaders(array));
	}
}