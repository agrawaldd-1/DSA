public class Main{
    static int removeDuplicates(int[] nums) {
        int res = 0;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[res] != nums[i]){
                res++;
                nums[res] = nums[i];
            }
        }return res;
    }
    public static void main(String[] args) {
     int[] array = {0,0,1,1,1,2,2,3,3,4};
     int result = removeDuplicates(array);
     System.out.println(result);   
    }
}