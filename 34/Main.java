import java.util.Arrays;

public class Main {

    static int[] searchRange(int[] nums, int target) {

        int[] array = {-1, -1};

        // First occurrence
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                array[0] = i;
                break;
            }
        }

        // Last occurrence
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                array[1] = j;
                break;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}