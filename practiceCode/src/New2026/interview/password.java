package New2026.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class password {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line = in.readLine();
        String strong = "[A-za-z@#$%^&*()\\d]{10,}";
        String medium = "[A-za-z@#$%^&*()\\d]{8,}";
        String weak = "[A-za-z\\d]{6,}";
        Pattern pStrong = Pattern.compile(strong);
        Pattern pmedium = Pattern.compile(weak);
        Pattern pweak = Pattern.compile(weak);
        if(pStrong.matcher(line).find()){
            System.out.println("strong");
        }else if(pmedium.matcher(line).find()){
            System.out.println("medium");
        }else if(pStrong.matcher(line).find()){
            System.out.println("weak");
        }else{
            System.out.println("invalid");
        }
        //String invalid = "[A-za-z\d]{5,}"
    /*while ((line = in.readLine()) != null) {
      System.out.println(line);
    }*/

    }
}
