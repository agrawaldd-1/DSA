public class Main
{
    public static String removeString(String s ,String word){
        String[] str = s.trim().split("\\s+");
        return helper(str , word , 0);
        
    }
    private static String helper(String[] words , String word , int index){

        String current = "";
        if(index == words.length){
            return current;
        }
        if(!words[index].equals(word)){
            current += words[index];
        }
        return current+ " " +helper(words,word,index+1);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(removeString("the sky is blue" , "is"));
	}
}