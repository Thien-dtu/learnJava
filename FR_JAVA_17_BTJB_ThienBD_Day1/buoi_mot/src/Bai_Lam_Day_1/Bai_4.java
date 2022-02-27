/**
 * 
 */
package Bai_Lam_Day_1;

import java.util.Scanner;

public class Bai_4 {
    public static void  main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi ban nhap vao so n: ");
            n = sc.nextInt();
        } while (n < 0);
        Tinh_Tong(n);
        Tich(n);
        sc.close();
    }

    public static void Tinh_Tong(int n) {
        int temp = 0, s=0;
        while (n > 0) {
            temp = n % 10;
            s += temp;
            n /= 10;
        }
        System.out.println("\n Tong cac chu so la: " +s);
    }
    public static void Tich(int n) {
        int s=1;
        while (n != 0) {
            s *= n%10;
            n /=10;
        }
        System.out.println("\n Tich cac chu so la: " +s);
    }
}
