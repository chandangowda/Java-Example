package com.example;

public class BinaryCountElement {

    public static  void main(String[] args){
        int[] countElementsInTheArray={3 ,1 ,2 ,2 ,1 ,2 ,3 ,3};
        System.out.println(countOccurence(countElementsInTheArray,countElementsInTheArray.length,3));
    }

    // Prints elements with more than n/k occurrences in arr[] of
    // size n. If there are no such elements, then it prints nothing.
    static int countOccurence(int arr[], int n, int k)
    {
        int count = 0;

        // k must be greater than 1 to get some output
        if(k < 2)
            return 0;
        /* Step 1: Create a temporary array (contains element
	        and count) of size k-1. Initialize count of all
	       elements as 0 */
        eleCount temp[] = new eleCount[k];

        for(int i = 0; i < k; i++)
            temp[i] = new eleCount(0, 0);

        /* Step 2: Process all elements of input array */
        for (int i = 0; i < n; i++)
        {
            int j = 0;

    		/* If arr[i] is already present in
    		the element count array, then increment its count */
            for (j=0; j<k; j++)
            {
                if (temp[j].e == arr[i])
                {
                    temp[j].c += 1;
                    break;
                }
            }

            /* If arr[i] is not present in temp[] */
            if (j == k)
            {
                int l = 0;

    			/* If there is position available in temp[], then place
    			arr[i] in the first available position and set count as 1*/
                for (l=0; l<k; l++)
                {
                    if (temp[l].c == 0)
                    {

                        temp[l].e = arr[i];
                        temp[l].c = 1;
                        break;
                    }
                }

    			/* If all the position in the temp[] are filled, then
    			decrease count of every element by 1 */
                if (l == k)
                    for (l=0; l<k; l++)
                        temp[l].c -= 1;
            }
        }

        /*Step 3: Check actual counts of potential candidates in temp[]*/
        for (int i=0; i<k; i++)
        {
            // Calculate actual count of elements
            int ac = 0; // actual count
            for (int j=0; j<n; j++)
                if (arr[j] == temp[i].e)
                    ac++;

            // If actual count is more than n/k, then print it
            if (ac > n/k)
                count++;
        }

        return count;
    }
}


class eleCount
{
    int e; // Element
    int c; // Count
    eleCount(int a, int b)
    {
        this.e = a;
        this.c = b;
    }
}