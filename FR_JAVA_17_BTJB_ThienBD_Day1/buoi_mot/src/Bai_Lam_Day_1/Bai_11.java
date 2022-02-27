package Bai_Lam_Day_1;

public class Bai_11 {
	public static void change(int a, int b) {
		int c = 0;
		c = a;
		a = b;
		b = c;
	}

	public static void changeArr(int[] arr) {
		int a = 100;
		arr[0] = 100;
	}

	public static void main(String[] args) {
		// by pass value
		int a = 3;
		int b = 4;
		change(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		// by pass reference
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int item : arr) {
			System.out.print(item);
		}
		System.out.println();
		changeArr(arr);
		for (int item : arr) {
			System.out.print(item);
		}
	}
}
