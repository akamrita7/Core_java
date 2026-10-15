package New2026.java8;

import java.util.Arrays;

public class int5 {
    public static void main(String[] args){
        String s1 = "purvasha";
        String s2 = "ashapurv";
//        checkForCircularRverseEqual(s1,s2,s2.charAt(0));
        checkForCircularRverseEqual2(s1,s2,s2.charAt(0));
    }



    private static void checkForCircularRverseEqual2(String s1, String s2, Character rev) {
            if(s1.length() != s2.length()){
                System.out.println("Not equal");
                return ;
            }
            int i = 0;
            while(s1.charAt(i) != rev){
                i++;
            }
            if(s2.equals(s1.substring(i,s1.length()) + s1.substring(0,i))) {
                System.out.println(" equal");
            }else{
                System.out.println("Not equal");
            }
    }


    private static void checkForCircularRverseEqual(String s1, String s2, Character rev) {
        if(s1.length() != s2.length()){
            System.out.println("Not equal");
            return ;
        }
        int i = 0;
        while(s1.charAt(i) != rev){
            i++;
        }
        //i++;
        int j = i;

        StringBuffer b = new StringBuffer();
        while(i<s1.length()){
            b.append(s1.charAt(i));
            i++;
        }
        i =0;
        while(i<j){
            b.append(s1.charAt(i));
            i++;
        }
        if(b.toString().equals(s2)){
            System.out.println(" equal");
        }else{
            System.out.println("Not equal");
        }



    }
}


