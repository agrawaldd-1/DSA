import java.util.*;

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        long left_sum = 0;
        long max_sum = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                left = new ArrayList<>();
                left_sum = 0;
                continue;
            }

            left.add(arr[i]);
            left_sum += arr[i];

            if(left_sum > max_sum || (left_sum == max_sum && left.size() > right.size())){
                right = new ArrayList<>(left);
                max_sum = left_sum;
            }
        }

        if(right.isEmpty()){
            right.add(-1);
        }

        return right;
    }
}