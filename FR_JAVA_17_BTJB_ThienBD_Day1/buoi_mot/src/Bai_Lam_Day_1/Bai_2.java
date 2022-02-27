/**
 * 
 */
package Bai_Lam_Day_1;

import java.util.Scanner;

public class Bai_2 {
    public static void  main(String[] args) {
        int n;
        float s = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so n: ");
            n = sc.nextInt();
        } while (n < 0);

        for ( float i =1; i <= n; i++) {
            s += 1/i;
        }
        System.out.println("\n S=1+1/2+1/3+....+1/n la : " + s);
        sc.close();
    }
}
