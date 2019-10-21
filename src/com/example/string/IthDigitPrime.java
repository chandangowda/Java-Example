package com.example.string;

public class IthDigitPrime {

    public static void main(String[] args) {
        nthNumber(11);
        nthprimedigitsnumber(11);

    }

    static void nthNumber(int n) {
        int d = 0, num = 0;
        while (num < n) {
            d++;
            num += Math.pow(4, d);

        }
        num -= Math.pow(4, d);

        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= 4; j++) {
                if (Math.pow(4, d - i) + num < n) {
                    num += Math.pow(4, d - i);
                } else {
                    if (j == 1) {
                        System.out.print(2);
                    } else if (j == 2) {
                        System.out.print(3);
                    } else if (j == 3) {
                        System.out.print(5);
                    } else if (j == 4) {
                        System.out.print(7);
                    }
                    break;
                }
            }
        }
        System.out.println();
    }

    static void nthprimedigitsnumber(int number)
    {
        int rem;
        String num="";
        while (number>0) {
            // remainder for check element position
            rem = number % 4;
            switch (rem) {

                // if number is 1st position in tree
                case 1:
                    num+='2';
                    break;

                // if number is 2nd position in tree
                case 2:
                    num+='3';
                    break;

                // if number is 3rd position in tree
                case 3:
                    num+='5';
                    break;

                // if number is 4th position in tree
                case 0:
                    num+='7';
                    break;
            }

            number = number / 4;
        }

        System.out.println(new StringBuilder(num).reverse().toString());
    }
}
