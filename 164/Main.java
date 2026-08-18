class Main {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0 , j = 0 , k = 0;
        int[] mix = new int[nums1.length + nums2.length];

        while( i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
            }
            else{
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < nums1.length){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            mix[k] = nums2[j];
            j++;
            k++;
        }
        int n = mix.length;
        if (n % 2 == 0) {
            return (double) (mix[n / 2 - 1] + mix[n / 2]) / 2.0;
        } else {
            return (double) mix[n / 2];
        }
    }
}