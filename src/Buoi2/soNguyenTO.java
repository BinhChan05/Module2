package Buoi2;

import java.util.Scanner;

public class soNguyenTO {
    public soNguyenTO() {
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for(int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {

        int number = 2;
        int count = 0;
        while (count < 20) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }

    }
}