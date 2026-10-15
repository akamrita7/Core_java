package New2026.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
//https://www.geeksforgeeks.org/adding-one-to-number-represented-as-array-of-digits/
public class AddOneToArray {
    public static void main(String[] args)
    {
        Vector<Integer> digits = new Vector<>(Arrays.asList(1,9,9,9,9));
//        Vector<Integer> digits = new Vector<>(Arrays.asList(9,9,9,9));
        AddOne(digits);
        for(int i : digits){
            System.out.println(i);
        }
    }

    private static void AddOne(Vector<Integer> digits) {
        Collections.reverse(digits);
        int carry = 1;
        for(int i = 0; i < digits.size(); i++)
        {
          if(digits.get(i)+carry>=10){
              carry = (digits.get(i)+1)/10;
              digits.set(i,0);
          }else{
              digits.set(i,digits.get(i)+carry);
              carry = (digits.get(i)+1)/10;
          }
        }
        if(carry==1){
            digits.add(carry);
        }
        Collections.reverse(digits);
    }

    private static void AddOne2(Vector<Integer> digits) {
        int index = digits.size() -1;
        while(index>=0 && digits.get(index) == 9){
            digits.set(index , 0);
            index--;
        }
        if(index<0){
            digits.set(0,1);
            digits.add(0);
        }else{
            digits.set(index , digits.get(index)+1);
        }
    }
}
