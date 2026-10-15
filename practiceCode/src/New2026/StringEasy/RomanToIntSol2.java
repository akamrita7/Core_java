package New2026.StringEasy;

import java.util.HashMap;

public class RomanToIntSol2 {
    private static final HashMap<Character, Integer> roman = new HashMap<>(){
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };
    public static void main(String[] args)
    {

        // Considering inputs given are valid
        String input = "MCMIV";

        System.out.print("Integer form of Roman Numeral is " +
                romanToInt(input));
    }

    private static int romanToInt(String input) {
        int sum = 0 ;
        int len = input.length();
        for(int i=0; i < len; i++){
            if(i != len-1 && roman.get(input.charAt(i))<roman.get(input.charAt(i+1))){
                sum+= roman.get(input.charAt(i+1))- roman.get(input.charAt(i));
                i++;
            }else{
                sum+= roman.get(input.charAt(i));
            }
        }
        return sum;
    }
}
