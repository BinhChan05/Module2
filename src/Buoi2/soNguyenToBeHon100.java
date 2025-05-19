package Buoi2;

import java.util.Scanner;

public class soNguyenToBeHon100 {
    public soNguyenToBeHon100() {
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
        Scanner sc = new Scanner(System.in);

        for(int number = 2; number < 100; ++number) {
            if (isPrime(number)) {
                System.out.println(number + " ");
            }
        }

    }
}
