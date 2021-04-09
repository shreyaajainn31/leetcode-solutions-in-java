/*
Question link: https://leetcode.com/problems/string-to-integer-atoi/
 */
package Strings;

public class StringToInteger {

    private int countingValidDigits(String s){
        int i = 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            i++;
        }
        int digits = 0;
        int power =0;
        while(i < s.length()){

            if(Character.isDigit(s.charAt(i))){
                power++;
            }
            else{
                break;
            }
            i++;
        }

        return power;
    }
    public int myAtoi(String s) {
        s = s.trim();

        int i = 0;
        int sign = 1;

        if(s.length() == 0){
            return 0;
        }

        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        if(i < s.length() && s.charAt(i) == '+'){
            sign = 1;
            i++;
        }

        int power = countingValidDigits(s);

        if(power == 0){
            return 0;
        }

        if(power == 20){
            return sign < 0 ? Integer.MIN_VALUE: Integer.MAX_VALUE;
        }

        long number = 0;
        while(i < s.length() && power != 0){
            long digit = Long.parseLong(Character.toString(s.charAt(i)));
            long into = (long) Math.pow(10, power - 1);
            number+=digit *into;
            if(number > Integer.MAX_VALUE){
                return sign < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            i++;
            power--;
        }

        int ans = (int) number;
        return  ans * sign;


    }

    public static void main(String[] args) {

        StringToInteger toInteger = new StringToInteger();
        System.out.println(toInteger.myAtoi("   -42"));

    }
}
