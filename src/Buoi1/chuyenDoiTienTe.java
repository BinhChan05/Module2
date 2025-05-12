package Buoi1;

import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of money u wanna trade:");
        double amount = sc.nextDouble();
        System.out.print("To VND is: " + amount * 23000 + "VND");

    }
}
