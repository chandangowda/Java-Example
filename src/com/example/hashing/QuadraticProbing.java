package com.example.hashing;


/*Quadratic probing is a collision handling technique in hashing.
Quadratic probing says that whenever a collision occurs, search for i2 position.*/
public class QuadraticProbing {

    void QuadraticProbing(int hash[], int hashSize, int arr[], int sizeOfArray) {
        for (int i = 0; i < sizeOfArray; i++)// Iterating over array
        {
            if (hash[arr[i] % hashSize] == -1) //If the place is empty then we insert arr[i] at that place
            {
                hash[arr[i] % hashSize] = arr[i];
            } else {//Else we quadratically traverse the array to find the empty position
                int k = arr[i] % hashSize;
                int power = 1;
                while (hash[(k + power * power) % hashSize] != -1) {
                    power++;
                }
                hash[(k + power * power) % hashSize] = arr[i]; //Insert arr[i] after finding the empty position
            }
        }
    }

}
