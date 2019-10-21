package com.example.binary;

//Given an array A of N elements.Find the majority element in the array.
//A majority element in an array A of size N is an element that appears more than N/2 times in the
public class BinaryMajority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,3,3,2,2,2,3,3,3,3,3};
		System.out.println();findCandidate(a,a.length);

	}

	/* Function to find the candidate for Majority */
	static int findCandidate(int a[], int size) {
		int maj_index = 0, count = 1;
		for (int i = 1; i < size; i++) {
			if (a[maj_index] == a[i])
				count++;
			else
				count--;
			if (count == 0) {
				maj_index = i;
				count = 1;
			}
		}
		return a[maj_index];
	}

	/*
	 * Function to check if the candidate occurs more than n/2 times
	 */
	static boolean isMajority(int a[], int size, int cand) {
		int count = 0;
		for (int i = 0; i < size; i++)

			if (a[i] == cand)
				count++;

		if (count > size / 2)
			return true;
		else
			return false;
	}

	static int majorityElement(int a[], int size) {
		/* Find the candidate for Majority */
		int cand = findCandidate(a, size);

		/* Print the candidate if it is Majority */
		if (isMajority(a, size, cand) == true)
			return cand;
		else
			return -1;
	}

}
