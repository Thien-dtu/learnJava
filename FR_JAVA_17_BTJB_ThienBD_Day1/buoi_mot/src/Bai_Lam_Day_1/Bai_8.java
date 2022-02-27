/*Account ThienBD
 *
 *@author DucThien
 *@date Jan 6, 2022
 *@version 1.0
 */

/**
 * 
 */
package Bai_Lam_Day_1;

import java.util.Scanner;

/**
 * @author DucThien
 *
 */
public class Bai_8 {

	/**
	 * @param args
	 */

	public static int tongSoLe(int arr[],int n) {
		int dapan = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] %2 != 0)
	        dapan += arr[i];
	    }
        return dapan;
    }
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Moi ban nhap vao so phan tu trong mang: ");
			n = sc.nextInt();
		} while (n < 0);
		
		int arr[] = new int [n];
		
		System.out.println("Nhap cac phan tu cho mang: ");
	    for (int i = 0; i < n; i++) {
	    	int dem = i+1;
	        System.out.print("Nhap phun tu thu " + dem + ": ");
	        arr[i] = sc.nextInt();
	    }
	    
	    System.out.println("Tong so le cua mang la: "+tongSoLe(arr, n));
	    sc.close();
	}

}
