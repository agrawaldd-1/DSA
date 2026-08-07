public class EvenDigits {
    static int findNumbers(int[] array){
        int count = 0;
        for(int i = 0 ; i< array.length ; i++){
            // even(array[i]);
            if(even(array[i]) == true){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }
    static int  digits(int num){
        int count = 0;
        if(num < 0){
            num = num*-1;
        }
        if(num == 0){
            return -1;
        }
        while(num>0){
            num= num/10;
            count++;
        }
        return count;        
    }

    public static void main(String[] args) {
        int[] array = {12,345,2,6,7896};
        int result = findNumbers(array);
        System.out.println(result);
    }
}
