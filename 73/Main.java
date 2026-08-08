import java.util.*;
public class Main
{
    public static void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for(int i = 0 ; i < matrix.length ; i++){
            for(int  j = 0 ; j < matrix[0].length;j++ ){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i = 0 ; i < row.length ; i++){
            for(int j = 0 ; j < col.length ; j++){
                if(row[i] == true || col[j] == true){
                    matrix[i][j]= 0;
                }
            }
        }
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
		System.out.println(Arrays.deepToString(matrix));
	}
}