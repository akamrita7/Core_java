package New2026.interview;

import java.util.Arrays;

public class compareArray {

    public static void main(String[] args) {
        Integer a1[] = new Integer[]{1, 2};
        Integer a2[] = new Integer[]{2, 1};
        if (compareA1andA2(a1, a2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

    private static boolean compareA1andA2(Integer[] a1, Integer[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        Boolean flag = false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i].equals(a2[i])) {
                flag = true;
            }
        }
        return flag;
    }
    private static boolean compareA1andA22(Integer[] a1, Integer[] a2) {
        if (Arrays.equals(a1, a2)) {
            return true;
        }
        return false;
    }
}
