package com.example.greedy;

public class LargestNumber {

    // Function to print the largest possible number with digit sum 's'
    // and 'm' number of digits
    static void findLargest(int m, int s) {
        // If sum of digits is 0, then a number is possible
        // only if number of digits is 1
        if (s == 0) {
            System.out.print(m == 1 ? "Largest number is 0" : "Not possible");

            return;
        }

        // Sum greater than the maximum possible sum
        if (s > 9 * m) {
            System.out.println("Not possible");
            return;
        }

        // Create an array to store digits of result
        int[] res = new int[m];

        // Fill from most significant digit to least
        // significant digit
        for (int i = 0; i < m; i++) {
            // Fill 9 first to make the number largest
            if (s >= 9) {
                res[i] = 9;
                s -= 9;
            }

            // If remaining sum becomes less than 9, then
            // fill the remaining sum
            else {
                res[i] = s;
                s = 0;
            }
        }

        System.out.print("Largest number is ");
        for (int i = 0; i < m; i++)
            System.out.print(res[i]);
    }

    // driver program
    public static void main(String[] args) {
        int s = 9, m = 2;
        findLargest(m, s);
    }
}
