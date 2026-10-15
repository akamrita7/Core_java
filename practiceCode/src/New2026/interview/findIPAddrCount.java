package New2026.interview;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.util.regex.Pattern;
/*BufferedReader br;
br =  Files.newBufferedReader(Paths.get(fileName));
                while ((line = br.readLine()) != null) {
                    Matcher matcher = findIPAddrPattern.matcher(line);
                }*/

public class findIPAddrCount {
    public static void main(String args[]) {
    String fileName = "C:\\project\\Program_prac\\src\\main\\resources\\lines.txt";
    HashMap<String, Integer> ipAddressCounts = new HashMap<>();
            try {
                List<String> lines = Files.readAllLines(Paths.get(fileName));
                Pattern findIPAddrPattern = Pattern.compile("(\\d{3}(\\.\\d{2}){2}\\.\\d{2,3})");
                for (String line : lines){
                    Matcher matcher = findIPAddrPattern.matcher(line);
                    while (matcher.find()){
                      String ipAddr = matcher.group(1);
                      if(ipAddressCounts.containsKey(ipAddr)){
                          ipAddressCounts.put(ipAddr , ipAddressCounts.get(ipAddr)+1);
                      }else{
                          ipAddressCounts.put(ipAddr , 1);
                      }
                    }
                }
                for(Map.Entry<String,Integer> entry : ipAddressCounts.entrySet()){
                    System.out.println(entry.getKey()+ " : " + entry.getValue());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
