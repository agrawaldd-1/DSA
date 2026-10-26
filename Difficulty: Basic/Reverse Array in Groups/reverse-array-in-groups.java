class Solution {
    public void reverseInGroups(int[] arr, int k) {
        if(arr.length > k){
            int[] array = multipleGroups(arr, k);
            for(int i = 0; i < arr.length; i++){
                arr[i] = array[i];
            }
        } else {
            int[] array = singleGroup(arr, k);
            for(int i = 0; i < arr.length; i++){
                arr[i] = array[i];
            }
        }
    }

    private int[] multipleGroups(int[] arr, int k) {
        int[] array = new int[arr.length];
        int start = 0;

        while(start < arr.length){
            int end = Math.min(start + k - 1, arr.length - 1);
            int index = start;

            for(int i = end; i >= start; i--){
                array[index] = arr[i];
                index++;
            }

            start += k;
        }

        return array;
    }

    private int[] singleGroup(int[] arr, int k) {
        int[] array = new int[arr.length];
        int n = arr.length - 1;

        for(int i = 0; i < arr.length; i++){
            array[i] = arr[n];
            n--;
        }

        return array;
    }
}