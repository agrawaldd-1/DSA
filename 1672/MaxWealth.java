public class MaxWealth {
    static int maximumWealth(int[][] array){
        int[] wealth = new int[array.length]; 
        int num =0;
        for(int i = 0 ; i<array.length; i++){
            num = 0;
            for(int j = 0 ; j< array[i].length ; j++){
                
               num = num + array[i][j]; 
            }
            wealth[i] = num;
        }
        int rich = max(wealth);
        return rich;
    }
    static int max(int[] array){
        int max_num = array[0];
        for(int i = 1 ; i<array.length ; i++){
            if(array[i] > max_num){
                max_num = array[i];
            }
        }
        return max_num;
    }
    public static void main(String[] args) {
        int [][] array = {
            {1,5} ,{7,3} , {3,5}
        };
        int result = maximumWealth(array);
        System.out.println(result);

    }
}
