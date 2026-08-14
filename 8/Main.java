public class Main
{
    static int helper(String s , int i , long num, int sign){
        int min = -2147483648;
        int max = 2147483647;
        if(i >= s.length() || !Character.isDigit(s.charAt(i))){
            return (int)(sign*num);
        }
        num = num*10 + (s.charAt(i) - '0');
        if (sign == -1 && num > 2147483648L) {
    return Integer.MIN_VALUE;
}

if (sign == 1 && num > 2147483647L) {
    return Integer.MAX_VALUE;
}
        return helper(s,i+1,num,sign);
    }
    public static int myAtoi(String s) {
        int i = 0;
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        if (i < s.length() && s.charAt(i) == '-') {
    sign = -1;
    i++;
}
else if (i < s.length() && s.charAt(i) == '+') {
    sign = 1;
    i++;
}
        return helper(s,i,0,sign);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(myAtoi("-91283472332"));
	}
}