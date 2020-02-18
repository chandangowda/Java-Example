package com.example.BinaryHeap;

public class MinHeapify {

    int[] harr;
    int capacity;
    int heap_size;

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return (2 * i + 1);
    }

    int right(int i) {
        return (2 * i + 2);
    }


    MinHeapify(int cap) {
        heap_size = 0;
        capacity = cap;
        harr = new int[cap];
    }


    void insertKey(int k) {

        heap_size++;
        int i = heap_size - 1;
        harr[i] = k;


        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }

    // Function to change value and store min value at first index
    void decreaseKey(int i, int new_val) {
        harr[i] = new_val;
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }

    // to extract minimum value in heap and then storing next mi value at first index
    int extractMin() {
        if (heap_size <= 0)
            return -1;
        if (heap_size == 1) {
            heap_size--;
            return harr[0];
        }


        int root = harr[0];
        harr[0] = harr[heap_size - 1];
        harr[heap_size - 1] = 0;
        heap_size--;

        MinHeapify(0);

        return root;
    }

    void deleteKey(int i) {
        if (i < heap_size) {
            decreaseKey(i, Integer.MIN_VALUE);
            extractMin();
        }
    }

    // Function to heapify as to store minimum value at first index
    void MinHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l] < harr[smallest]) // if value at smallest is larger change smallest
            smallest = l;
        if (r < heap_size && harr[r] < harr[smallest]) // if value at smallest is larger change smallest
            smallest = r;
        if (smallest != i) // if smallest is not same as initial value, only then
        {
            int temp = harr[i];
            harr[i] = harr[smallest];
            harr[smallest] = temp;
            MinHeapify(smallest); // recusrsively call Minheapify for smallest variable
        }
    }
}
