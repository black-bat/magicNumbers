package armstrongNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    static long N;
    static long S = 0;

    public static long[] getNumbers(long N) {
        long[] result = null;
        List<Long> numbers = new ArrayList<>();
        Solution1.N = N;
        long degree = 1;
        long sum = 0;
        for (; Solution1.S < N; S++) {
            String sString = String.valueOf(S);
            int m = sString.length();
            String[] sString1 = sString.split("");
            for (int i = 0; i < m; i++) {
                long j = Long.parseLong(sString1[i]);
                for (int g = 0; g < m; g++) {
                    degree *= j;
                }
                sum += degree;
                degree = 1;
            }
            if (sum == S) {
                numbers.add(sum);
                sum = 0;
            } else {
                sum = 0;
            }
        }
        S = 0;
        result = new long[numbers.size()];
        for (int k = 0; k < numbers.size(); k++) {
            result[k] = numbers.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}