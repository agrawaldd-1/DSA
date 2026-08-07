import java.util.HashSet;

public class Main
{
    public static int longestConsecutive(int[] nums) {
        int longStreak = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num-1) ){
                int current = num;
                int currentStreak = 1;
                
                while(set.contains(current+1)){
                    current = current+1;
                    currentStreak++;
                }
                
                longStreak = Math.max(longStreak , currentStreak);
            }
        }
        return longStreak;
    }
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int[] array = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(array));
	}
}