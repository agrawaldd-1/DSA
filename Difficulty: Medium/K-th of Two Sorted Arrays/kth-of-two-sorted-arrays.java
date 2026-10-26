class Solution {
    public int kthElement(int a[], int b[], int k) {
        int i = 0, j = 0, z = 0;
        int[] mix = new int[a.length + b.length];

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                mix[z] = a[i];
                i++;
            }
            else{
                mix[z] = b[j];
                j++;
            }
            z++;
        }

        while(i < a.length){
            mix[z] = a[i];
            i++;
            z++;
        }

        while(j < b.length){
            mix[z] = b[j];
            j++;
            z++;
        }

        return mix[k-1];
    }
}