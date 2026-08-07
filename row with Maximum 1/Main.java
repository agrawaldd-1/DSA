public class Main{
    static int rowWithMax1s(int[][]matrix , int m , int n){
        int max_cnt = 0;
        int index = -1;

        for(int i = 0; i < m ; i++){
            int count = 0;
            for(int j = 0 ; j<n ; j++){
                count += matrix[i][j];
            }
            if(count>max_cnt){
                max_cnt = count;
                index = i;
            }
        }
        return index;
    }
 public static void main (String[] args) {
     int[][] matrix = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
     int m = 3;
     int n = 3;
     System.out.println(rowWithMax1s(matrix , m , n));
 }   
}