package New2026.ArrayIDeserve;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Given a list of logs with IP addresses in the following format.[
lines = ["10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"]*/
public class FrequentIPAddress {
    public static void main(String[] args) {
        List<String> logs = List.of(
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.2 - GET 2020-08-20",
                "10.0.0.1 - POST 2020-08-25"
        );
        Map<String, Integer> counts = countIpAddresses(logs);
        System.out.println("IP Address Counts:");
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("using java 8");
        countIpAddresses2(logs)
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static Map<String, Integer> countIpAddresses(List<String> lines) {
        Map<String, Integer> ipCounts = new HashMap<>();

        for (String line : lines) {
            // Extract the IP address (which is the part before the first space)
            String ipAddress = line.split(" ")[0];
            // Increment the count for the IP address
            ipCounts.put(ipAddress, ipCounts.getOrDefault(ipAddress, 0) + 1);
        }
        return ipCounts;
    }
    public static Map<String, Long> countIpAddresses2(List<String> lines) {
        Map<String, Long> ipCounts = lines.stream()
                .map(line -> line.split(" ")[0])
                .collect(Collectors.groupingBy(Function.identity() ,
                        Collectors.counting()));
        return ipCounts;
    }
}
