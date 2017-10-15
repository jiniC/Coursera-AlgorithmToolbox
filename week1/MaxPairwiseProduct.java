import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int first_max_index = 0;
        int second_max_index = 0;
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            if ((first_max_index==0) || numbers[i] > numbers[first_max_index]) {
                first_max_index = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if ((i != first_max_index) && numbers[i] > numbers[second_max_index]) {
                second_max_index = i;
            }
        }
        result = (long)numbers[first_max_index] * numbers[second_max_index];
        return result;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}