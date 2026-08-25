import java.util.ArrayList;
import java.util.List;

public class Main
{
    static List<String> subseq(String p , String up){
        List<String> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        if(up.isEmpty()){
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        List<String> left = subseq(p + ch , up.substring(1));
        List<String> right = subseq(p , up.substring(1));
        
        left.addAll(right);
        return left;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(subseq("" , "abc"));
	}
}