public class Main {
    static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();
        for(int i = str.length-1;i>=0;i--){
            out.append(str[i]);
             if (i > 0) {
                out.append(" "); // Append space between words
            }
        }
        return out.toString();
    }
    public static void main(String[] args){
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}