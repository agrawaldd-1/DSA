import java.util.ArrayList;
import java.util.List;

public class Main{
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++){
            List<Integer>arr = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++){
                if (j == 0 || j == i) {
                    arr.add(1);
            }else{
                List<Integer> previous = result.get(i-1);
                int value = previous.get(j-1)+previous.get(j);
                arr.add(value);
            }
        }
        result.add(arr);
        
    }
    return result;
}
    public static void main (String[] args) {
        System.out.println(generate(3));
    }
}