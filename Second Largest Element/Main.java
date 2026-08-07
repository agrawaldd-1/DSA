public class Main {
    static int secondLargest(int[] arr, int n) {
        if(n < 2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0 ; i< n ; i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i]!= largest){
                second_largest = arr[i];
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        int[] array = {7, 7, 2, 2, 10, 10, 10};
        int n = array.length;
        System.out.println(secondLargest(array, n));
    }
}