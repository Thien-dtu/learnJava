/**
 * 
 */
package Bai_Lam_Day_1;

import java.util.Scanner;

public class Bai_6_nhi_Phan {
    public static void  main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi ban nhap vao so nguyen duong n: ");
            n =sc.nextInt();
        }while (n < 0);
        Bai_6_nhi_Phan np = new Bai_6_nhi_Phan();
        System.out.print("So nhi phan cua "+n+" la: ");
        np.cdnp(n);
        sc.close();
    }

    public void cdnp(int num){
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}
