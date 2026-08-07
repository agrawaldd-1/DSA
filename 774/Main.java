// package Smallest Letter Greater than Target;

public class Main {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end= letters.length-1;
        if(letters[end]== target){
            return letters[start];
        }

        while(start<=end){
            int mid = (start+end)/2;
           
            
            if(letters[mid]<=target){
                start = mid+1;
            }
            else{end = mid-1;}
        }
        return letters[start % letters.length];
}
public static void main(String[] args) {
    char[] array = {'e','e','e','e','e','e','n','n','n','n'};
    char target = 'e';
    
    char result = nextGreatestLetter(array ,  target);
    System.out.println(result);
}}
