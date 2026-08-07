class Solution {
    public String smallestNumber(String num, long t) {
        // Step 1: Factorize t into prime factors 2, 3, 5, 7
        long tempT = t;
        int c2 = 0, c3 = 0, c5 = 0, c7 = 0;
        
        while (tempT % 2 == 0) { c2++; tempT /= 2; }
        while (tempT % 3 == 0) { c3++; tempT /= 3; }
        while (tempT % 5 == 0) { c5++; tempT /= 5; }
        while (tempT % 7 == 0) { c7++; tempT /= 7; }
        
        if (tempT > 1) {
            return "-1"; // Impossible if t has prime factors > 7
        }

        int N = num.length();
        
        // Precompute prefix factor counts for num
        int[] p2 = new int[N + 1];
        int[] p3 = new int[N + 1];
        int[] p5 = new int[N + 1];
        int[] p7 = new int[N + 1];
        
        int firstZero = N;
        for (int i = 0; i < N; i++) {
            char ch = num.charAt(i);
            if (ch == '0') {
                firstZero = i;
                break;
            }
            int d = ch - '0';
            p2[i + 1] = p2[i] + countFactor(d, 2);
            p3[i + 1] = p3[i] + countFactor(d, 3);
            p5[i + 1] = p5[i] + countFactor(d, 5);
            p7[i + 1] = p7[i] + countFactor(d, 7);
        }

        // Check if num itself is valid
        if (firstZero == N && p2[N] >= c2 && p3[N] >= c3 && p5[N] >= c5 && p7[N] >= c7) {
            return num;
        }

        // Try to find a valid string of length N by modifying digit at index i
        for (int i = Math.min(N - 1, firstZero); i >= 0; i--) {
            int startDigit = (i == firstZero) ? 1 : (num.charAt(i) - '0' + 1);
            
            for (int d = startDigit; d <= 9; d++) {
                int rem2 = Math.max(0, c2 - p2[i] - countFactor(d, 2));
                int rem3 = Math.max(0, c3 - p3[i] - countFactor(d, 3));
                int rem5 = Math.max(0, c5 - p5[i] - countFactor(d, 5));
                int rem7 = Math.max(0, c7 - p7[i] - countFactor(d, 7));

                if (minDigits(rem2, rem3, rem5, rem7) <= N - 1 - i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(num, 0, i);
                    sb.append(d);
                    fillGreedySuffix(sb, N - 1 - i, rem2, rem3, rem5, rem7);
                    return sb.toString();
                }
            }
        }

        // If no string of length N works, construct the smallest string of length L > N
        int minD = minDigits(c2, c3, c5, c7);
        int L = Math.max(N + 1, minD);
        
        StringBuilder sb = new StringBuilder();
        fillGreedySuffix(sb, L, c2, c3, c5, c7);
        return sb.toString();
    }

    // Helper to count factor occurrences
    private int countFactor(int d, int p) {
        if (d == 0) return 0;
        int count = 0;
        while (d > 0 && d % p == 0) {
            count++;
            d /= p;
        }
        return count;
    }

    // Computes minimum digits required for factor counts
    private int minDigits(int r2, int r3, int r5, int r7) {
        return Math.max(0, r5) + Math.max(0, r7) + minDigits23(r2, r3);
    }

    // Minimum digits needed for 2s and 3s using 8 (2^3), 9 (3^2), 4 (2^2), 6 (2*3), 3, 2
    private int minDigits23(int r2, int r3) {
        if (r2 <= 0 && r3 <= 0) return 0;
        int minD = Integer.MAX_VALUE;
        for (int k = 0; k <= 5; k++) {
            int rem2 = Math.max(0, r2 - k);
            int rem3 = Math.max(0, r3 - k);
            int d = k + (rem3 + 1) / 2 + (rem2 + 2) / 3;
            minD = Math.min(minD, d);
        }
        return minD;
    }

    // Greedily appends the lexicographically smallest digits to satisfy factor requirements
    private void fillGreedySuffix(StringBuilder sb, int len, int r2, int r3, int r5, int r7) {
        for (int pos = 0; pos < len; pos++) {
            int remLen = len - pos;
            for (int d = 1; d <= 9; d++) {
                int nr2 = Math.max(0, r2 - countFactor(d, 2));
                int nr3 = Math.max(0, r3 - countFactor(d, 3));
                int nr5 = Math.max(0, r5 - countFactor(d, 5));
                int nr7 = Math.max(0, r7 - countFactor(d, 7));

                if (minDigits(nr2, nr3, nr5, nr7) <= remLen - 1) {
                    sb.append(d);
                    r2 = nr2;
                    r3 = nr3;
                    r5 = nr5;
                    r7 = nr7;
                    break;
                }
            }
        }
    }
}