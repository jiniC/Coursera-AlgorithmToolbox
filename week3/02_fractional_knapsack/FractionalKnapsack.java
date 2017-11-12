import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        int n = values.length;
        double[] wv = new double [n];
        for (int i = 0; i < n; i++) {
            wv[i] = (double)values[i]/weights[i];
        }
        // wv[i] 정렬
        int j,q,temp_w,temp_v = 0;
        double temp_wv = 0;
        for (j=0; j<n; j++) {
            for (q=j; q<n; q++) {
                if(wv[j]<wv[q]) {
                    temp_wv = wv[j];
                    wv[j] = wv[q];
                    wv[q] = temp_wv;
                    temp_w = weights[j];
                    weights[j] = weights[q];
                    weights[q] = temp_w;
                    temp_v = values[j];
                    values[j] = values[q];
                    values[q] = temp_v;
                }
            }
        }
        double value = 0;
        double plusWeight = 0;
        int i=0;
        while(capacity>0 && i<values.length) {
            if(weights[i]>capacity) {
                plusWeight = capacity;
            }
            else {
                plusWeight = weights[i];
            }
            value += plusWeight*wv[i];
            capacity -= plusWeight;
            i++;
        }
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
