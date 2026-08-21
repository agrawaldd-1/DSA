public class Main
{
    public static String removeCharater(String s ,char ch, int index){
        String current = "";
        if(index == s.length()){
            return current;
        }
        if(s.charAt(index) != ch){
            current += s.charAt(index);
        }
        return current+removeCharater(s,ch,index+1);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(removeCharater("banana" , 'a' , 0));
	}
}