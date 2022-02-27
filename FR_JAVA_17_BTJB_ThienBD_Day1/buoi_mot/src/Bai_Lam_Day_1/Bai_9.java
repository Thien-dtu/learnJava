package Bai_Lam_Day_1;

import java.util.Scanner;

public class Bai_9 {
	public static int[][] inputMultiArray(int m, int n) {
		Scanner sc = new Scanner(System.in);
		int[][] result = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Array[%d][%d] : ", i, j);
				result[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return result;
	}
	
	public static void outputMultiArray(int[][] array, int m, int n) {
		System.out.println("Array: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("[%d]", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int SumBS(int[][] array) {
		int sum = 0;
		for (int i = 0; i < array[1].length; i++) {
			if (array[0][i] % 3 == 0) {
				sum += array[0][i];
			}
		}
		return sum;
	}
	
	public static int[] maxArray(int[][] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int max = array[i][0];
			for (int j = 0; j < array[1].length; j++) {
				if (array[i][j] > max)
					max = array[i][j];
			}
			result[i] = max;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m ,n;
		System.out.printf("Nhap so dong: "); m = sc.nextInt();
		System.out.println("Nhap so cot: "); n = sc.nextInt();
		int[][] arrayResutl  = inputMultiArray(m,n);
		outputMultiArray(arrayResutl, m, n);
		System.out.println(" Tich cac so la boi so cua 3 nam tren dong dau tien: "+SumBS(arrayResutl));
		int[] arrayX = maxArray(arrayResutl);
		for (int j = 0; j < arrayX.length; j++) {
			System.out.println("Mang X voi  X["+j+"] + co gia ti lon nhat: "+arrayX[j]);
		}
		System.out.println();
		sc.close();
	}
}
