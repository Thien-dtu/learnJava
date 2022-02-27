/**
 * 
 */
package Bai_Lam_Day_1;

import java.util.Scanner;

public class Bai_3 {
    public static void  main(String[] args) {
        int n;
        float s = 0;
        int gt;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi ban nhap vao so n: ");
            n = sc.nextInt();
        } while (n < 0);
        for (int i = 1; i <= n; i++) {
        	gt = gt(i);
			s += (float) 1/gt;
			System.out.println("S(1/((2*n-1)!) = " + s);
			gt = 0;
        }
        System.out.println(s);
        sc.close();

    }
    
    public static int gt(int n) {
		int gt = 1;
		for (int i = 1; i <= n; i++) {
			gt = gt * i;
		}	
		return gt;
	}
}
