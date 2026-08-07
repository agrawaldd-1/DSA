public class Main {
    static String longestCommonPrefix(String[] strs) {
        for(int i = 0; i<strs[0].length() ;i++){
            for(int j = 1 ; j<strs.length ; j++){
                if(i>=strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }    

    public static void main(String[] args) {
        // String[] array = {"flower","flow","flight"};
        String[] array = {"dog","racecar","car"};
        String result = longestCommonPrefix(array);
        System.out.println(result);
    }
}
