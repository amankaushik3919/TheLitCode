class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0; // No primes less than 2
        }

        // Create a boolean array "isPrime[]" and initialize all entries as true
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Start marking multiples of each prime number as false
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as not prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}