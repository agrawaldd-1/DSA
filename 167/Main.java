import java.util.Arrays;

public class Main{
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start<end){
            int sum = numbers[start]+numbers[end];
            if(sum == target){
                return new int[]{start , end};
            }
            if(sum > target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 18;
        int[] result = twoSum(array, target);
        System.out.println(Arrays.toString(result));
    }
}