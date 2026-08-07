public class Main{
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length-1;

        while(column > 0 && row < matrix.length){
            if(matrix[row][column] == target){
                return true;
            }
            if(matrix[row][column] > target){
                column--;
            }
            else{
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1,4,7,11,15} , {2,5,8,12,19},{3,6,9,16,22} , {10,13,14,17,24} , {18,21,23,26,30}};
        int target = 55;
        boolean result = searchMatrix(array, target);
        System.out.println(result);
    }
}