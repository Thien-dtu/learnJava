/**
 * 
 */
package Bai_Lam_Day_1;

import java.util.Scanner;

public class Bai_5_ucln_bcnn {
    public static void  main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so a: ");
            a = sc.nextInt();
        }while (a < 0);
        do {
            System.out.println("Nhap vao so b: ");
            b = sc.nextInt();
        }while (b < 0);

        System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+ UCLN(a,b));

        System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/ UCLN(a,b)));
        sc.close();
    }

    public static int UCLN(int a, int b) {
        while ( a != b ) {
            if (a > b){
                a -= b;
            } else {
                b -=a;
            }
        }
        return  a;
    }
}
