public class Main {
    static int maxDepth(String s) {
        int level = 0;
        int max_count = 0;
        for(char ch : s.toCharArray() ) {
            if(level > max_count){
                max_count = level;
            }
            if(ch == '('){
                level++;
            }
            else if(ch == ')'){
                level--;
            }
        }
        return max_count;  
    } 
    public static void main(String[] args) {
        // Solution sol = new Solution();
        String s = "(1+(2*3)+((8)/4))+1";
        int result = maxDepth(s);
        System.out.println("Max Depth: " + result);
    }   
}
