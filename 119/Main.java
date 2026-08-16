import java.util.*;

public class Main
{
    public static List<Integer> getRow(int rowIndex) {
    List<List<Integer>> triangle = new ArrayList<>();
    for(int i = 0 ; i <= rowIndex ; i++){
        List<Integer> array = new ArrayList<>();
        for(int j = 0 ; j<= i ; j++){
            if(j == 0 || j == i){
                array.add(1);
            }
            else{
                List<Integer> previous = triangle.get(i-1);
                int value = previous.get(j-1) + previous.get(j);
                array.add(value);
            }
        }
        triangle.add(array);
    }
    List<Integer> result = triangle.get(triangle.size() - 1);
    return result;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(getRow(0));
		
	}
}