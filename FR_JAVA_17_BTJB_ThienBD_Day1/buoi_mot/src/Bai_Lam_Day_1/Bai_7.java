/**
 * 
 */
package Bai_Lam_Day_1;

import java.util.Scanner;

public class Bai_7 {
	/*
	 * a. In ra màn hình String đảo ngược của S
	 * b. �?ổi toàn bộ kí tự của S sang chữ Hoa
	 * c. �?ổi toàn bộ kí tự của S sang chữ thư�?ng
	 * d. �?ưa ra bảng tần số xuất hiện của các kí tự trong S
	 * e. Trích ra chuỗi con của từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
	 */
    public static String daoChuoi(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static String chuHoa(String s) {
        String result = "";
        result = s.toUpperCase();
        return result;
    }

    public static String chuThuong(String s) {
        String result = "";
        result = s.toLowerCase();
        return result;
    }

    public static void demKyTuXH(String s) {
    	int dem[] = new int[256];
        int len = s.length();
        for (int i = 0; i < len; i++)
            dem[s.charAt(i)]++;
        char array[] = new char[s.length()];
        for (int i = 0; i < len; i++) {
            array[i] = s.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("So lan xuat hien cua " + s.charAt(i)
                        + " trong chuoi:" + dem[s.charAt(i)]);
        }
    }
    
    public static void layChuoiKT(String s, int dem) {
		char[] ch = new char[dem];
		int a,b;
		String chuoi =s ;
		Scanner sc = new Scanner(System.in);
			System.out.print("Moi nhap vao vi tri thu n: ");
			a = sc.nextInt();
			System.out.print("Moi nhap vao vi tri thu m: ");
			b = sc.nextInt();
		
		try {
			chuoi.getChars(a, b, ch, 0);
		} catch (Exception e) {
		}
		System.out.print("Chuoi con tu ky tu n den m la: ");
		System.out.println(ch);
	}
	
    public static void  main(String[] args) {
    	String input;
    	int key = 0, dem = 0;
    	Scanner sc = new Scanner(System.in);
			System.out.println("Nhap chuoi: ");
			input = sc.nextLine();
			dem = input.length();
			System.out.println("Nhap chuc nang ban muon dung: ");
			System.out.println("========================================================");
			System.out.println("Nhan 1 de dao nguoc chuoi. ");
			System.out.println("Nhan 2 de doi toan bo ky tu sang chu HOA. ");
			System.out.println("Nhan 3 de doi toan bo ky tu sang chu thuong. ");
			System.out.println("Nhan 4 de dua ra bang tan so xuat hien cua cac ky tu. ");
			System.out.println("Nhan 5 de trich ra chuoi con tu ky tu n den m.");
			System.out.println("Nhan 6 de chay het.");
			System.out.println("Nhan 2102 de thoat khoi chuong trinh.");
			System.out.println("========================================================");
			
			key = sc.nextInt();
        switch (key) {
		case 1:
			System.out.println("Chuoi da dao nguoc la: "+daoChuoi(input));
			break;
		case 2:
			System.out.println("Chuoi da chuyen sang ky tu Hoa: " +chuHoa(input));
			break;
		case 3:
			System.out.println("Chuoi da doi sang ky tu thuong: "+chuThuong(input));
			break;
		case 4: 
			System.out.println("Tan so xuat hien cua cac ky tu la: ");
			demKyTuXH(input);
			break;
		case 5:
			System.out.println("Do dai cua chuoi la = "+dem);
			layChuoiKT(input, dem);
			break;
		case 6:
			System.out.println("Chuoi da dao nguoc la: "+daoChuoi(input));
			System.out.println("Chuoi da chuyen sang ky tu Hoa: " +chuHoa(input));
			System.out.println("Chuoi da doi sang ky tu thuong: "+chuThuong(input));
			System.out.println("Tan so xuat hien cua cac ky tu la: ");
			demKyTuXH(input);
			System.out.println("Do dai chuoi la: "+dem);
			layChuoiKT(input, dem);
			break;
		default:
			if(key == 2102) {
				System.out.print("Cam on vi da su dung chuong trinh.");
				break;
			}else {
				System.out.println("Moi ban nhap lai cho dung so");
			}
			
		}
        sc.close();
    }
}
