package com.example;

public class BitBitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFirstSetBitPos(8));

		System.out.println(turnOffK(7, 3));

	}

	public static int getFirstSetBitPos(int n) {

		// Your code here

		int a = (n) ^ (n - 1);
		return (int) (Math.log(a + 1) / Math.log(2) + 1e-10);

//	     
//	     if(n==0) return 0;
//	        return (int)(Math.log(n&-n)/Math.log(2.0)) + 1; 
		// doing AND of n and -n as n and -n will have only one bit similar so and will
		// turn all other
		// bits into zero. The result has its log2 taken to find the position and we add
		// 1 to get
		// count from 1 instead of zero

	}

	// Function to returns a number that has all bits same as n
	// except the k'th bit which is made 0
	static int turnOffK(int n, int k) {
		// k must be greater than 0
		if (k <= 0)
			return n;

		// Do & of n with a number with all set bits except
		// the k'th bit
		return (n & ~(1 << (k - 1)));
	}

	// Returns a number that has all
	// bits same as n except the k'th
	// bit which is made 1
	static int turnOnK(int n, int k) {

		// k must be greater than 0
		if (k <= 0)
			return n;

		// Do | of n with a number with
		// all unset bits except the
		// k'th bit
		return (n | (1 << (k - 1)));
	}

	public static int posOfRightMostDiffBit(int m, int n) {

		if (m == n) {
			return -1; // if numbers are same then they have same bits
		}
		return getFirstSetBitPos(m ^ n); // xor the numbers and find their rightmost set bit.
		// xor only sets the dissimilar bits and unsets similar bit

	}

	// Function to check if Kth bit is set or not
	boolean checkKthBit(int n, int k) {

		return ((n & (1 << (k))) != 0);

	}

	public static int countSetBits(int n) {

		int ans = 0; // initialise ans to 0

		for (int i = 1; i <= n; i++) {
			int x = i; // assigning i to x
			while (x > 0) {
				x = x & (x - 1); // counting set bits in x
				ans++; // subsequently increasing the value of answer
			}
		}
		return ans;
	}

	public static int countBitsFlip(int a, int b) {

		int ans = a ^ b;

		return countSetBit(ans);

	}

	public static int countSetBit(int n) {

		int count = 0;
		while (n > 0) {
			count += n & 1;
			n >>= 1;
		}
		return count;

	}

	/*
	 * Given a number N. The task is to check whether it is sparse or not. A number
	 * is said to be a sparse number if no two or more consecutive bits are set in
	 * the binary representation.
	 */
	public static boolean isSparse(int n) {

		return (n & (n >> 1)) == 0;

	}

}
