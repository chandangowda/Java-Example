package com.example.greedy;


/*Given a binary encoded string and a Huffman MinHeap tree, your task is to complete the
function decodeHuffmanData(), which decodes the binary encoded string and return the original string.*/
class MinHeapNode
{
    char data;
    int freq;
    MinHeapNode left, right, top;
    MinHeapNode(char c, int freq)
    {
        left = right = null;
        this.data = c;
        this.freq = freq;
    }
}

public class HuffmanDecoding {

    static String decodeHuffmanData(MinHeapNode root, String binaryString) {

        String ans = "";
        MinHeapNode curr = root;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0')
                curr = curr.left;
            else
                curr = curr.right;
            if (curr.left == null && curr.right == null) {
                ans += curr.data;
                curr = root;
            }
        }
        return ans + '\0';

    }

    public static void main(String[] args) {

    }
}
