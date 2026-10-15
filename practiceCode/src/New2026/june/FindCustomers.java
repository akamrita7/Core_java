package New2026.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCustomers {
    public static String[][] findCustomers(String[][] matrix, String branchCode) {
        List<String[]> result = new ArrayList<>();
        for (String[] row : matrix) {
            if (row[3].equals(branchCode)) {
                result.add(row);
            }
        }
        /*result.sort((a, b) -> Long.compare(
                Long.parseLong(a[0]),
                Long.parseLong(b[0]))
        );*/
        return result.toArray(new String[result.size()][]);
    }
    public static void main(String[] args) {

        String[][] matrix = {
                {"11221909566", "shivam kumar", "9128494856", "1022"},
                {"11221909312", "rohan garg", "7384728384", "1022"},
                {"11201339211", "shivam sharma", "7384728384", "1987"}
        };

        String[][] result = findCustomers(matrix, "1022");

        for (String[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}

