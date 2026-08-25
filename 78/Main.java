class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : nums){
            int n = outer.size();
            for(int i = 0;i<n;i++){
                List<Integer> interval = new ArrayList<>(outer.get(i));
                interval.add(num);
                outer.add(interval);
            }
        }
        return outer;
    }
}