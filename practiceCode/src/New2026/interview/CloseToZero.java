package New2026.interview;

import java.io.IOException;
import java.util.Arrays;

import static java.lang.Math.abs;
import static java.lang.Math.max;

// https://stackoverflow.com/questions/23760979/finding-closest-number-to-0

public class CloseToZero {

    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] arr_A = br.readLine().split(" ");
        for(int i_A = 0; i_A < N; i_A++) {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }*/
        //int out_ = Solve(N, A);
        int[] data = {2,3,-2 , -3 , 1};
        int out_ = Solve(1, data);

        System.out.println(out_);

        //wr.close();
        //br.close();
    }

    private static int Solve(int n, int[] str) {
        return Arrays.stream(str).filter(i -> i != 0)
                .reduce((a, b) -> abs(a) < abs(b) ? a : (abs(a) == abs(b) ? max(a, b) : b))
                .getAsInt();
    }
}
