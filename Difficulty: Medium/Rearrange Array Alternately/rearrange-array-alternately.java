import java.util.Arrays;

class Solution {
    public void rearrange(int arr[]) {
        Arrays.sort(arr);

        int mid = (arr.length + 1) / 2;
        int[] array1 = new int[mid];
        int[] array2 = new int[arr.length / 2];
        int[] array = new int[arr.length];

        int i = 0, j = 0, k = 0;
        int n = arr.length - 1;

        for(i = 0; i < array1.length; i++){
            array1[i] = arr[i];
        }

        for(i = 0; i < array2.length; i++){
            array2[i] = arr[n];
            n--;
        }

        i = 0;

        while(i < array1.length && j < array2.length){
            array[k] = array2[j];
            k++;
            j++;

            array[k] = array1[i];
            k++;
            i++;
        }

        while(i < array1.length){
            array[k] = array1[i];
            i++;
            k++;
        }

        for(i = 0; i < arr.length; i++){
            arr[i] = array[i];
        }
    }
}