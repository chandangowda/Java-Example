package com.example.binary;

//Given a sorted array arr[] of size N without duplicates, and given a value x. Find the floor of x
//in given array. Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x
public class BinaryFloorSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] floorArray = { 1, 2, 5, 10, 12, 14 };
		System.out.println(findFloor(floorArray, 0, floorArray.length - 1, 13));

	}

	// Function to find floor for the given x
	// this is just like binary search
	public static int findFloor(int arr[], int low, int high, int x) {
		// If low and high cross each other
		if (low > high)
			return -1;

		// If last element is smaller than x
		if (x >= arr[high])
			return high;

		// Find the middle point
		int mid = (low + high) / 2;

		// If middle point is floor.
		if (arr[mid] == x)
			return mid;

		// If x lies between mid-1 and mid
		if (mid > 0 && arr[mid - 1] <= x && x < arr[mid])
			return mid - 1;

		// If x is smaller than mid, floor
		// must be in left half.
		if (x < arr[mid])
			return findFloor(arr, low, mid - 1, x);

		// If mid-1 is not floor and x is
		// greater than arr[mid],
		return findFloor(arr, mid + 1, high, x);
	}

}
