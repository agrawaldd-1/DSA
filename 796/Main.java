public class Main {
    static boolean rotateString(String s , String goal){
        if(s.length() != goal.length() ){
            return false;
        }
        String doubleString = s+s;
        return doubleString.contains(goal);
    }
}
