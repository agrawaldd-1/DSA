// import java.util.HashMap;

class Solution {
    public String intToRoman(int num) {
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
            };
        String[] symbols = {"M", "CM", "D", "CD",
                            "C", "XC", "L", "XL",
                            "X", "IX", "V", "IV", "I"
                            };
        HashMap<Integer , String> n = new HashMap<>();
        for(int i = 0;i<values.length;i++){
            n.put(values[i] , symbols[i]);
        }
        String result = "";
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                result += n.get(values[i]);
                num -= values[i];
            }
        }
        return result;
    }
}