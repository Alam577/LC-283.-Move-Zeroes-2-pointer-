public class PrimeSetBits {
    
    public static int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            if (isPrime(bits)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 6, right = 10;
        System.out.println(countPrimeSetBits(left, right)); // Output: 4
    }
}
