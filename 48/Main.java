import java.util.*;
public class Main
{
    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            
                int left = 0;
                int right = matrix[i].length - 1;
                while(left < right){
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }
            
        }
        
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		System.out.println(Arrays.deepToString(matrix));
	}
}