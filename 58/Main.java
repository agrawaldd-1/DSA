public class Main{
    static int lengthOfLastWord(String s) {
     int i = s.length()-1;
     int count = 0;
     while(s.charAt(i)== ' '){
        i--;
     }   
     while(i>=0 && s.charAt(i) != ' '){
        count++;
        i--;
     }
     return count;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}