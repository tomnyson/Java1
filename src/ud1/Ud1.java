/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

import java.util.Properties;
import java.util.Scanner;

/**
 * PK01991	Phan Thanh Thắng PK01996	Phạm Xuân Hướng PK02125	Lục Thị Quỳnh Nga
 * PK02011	Lê Đình Lực /** PK01989	Đặng Thế Nguyên
 * PT163LT	PK02011	Lê Đình Lực chép 20*2 lần cách khai báo các kiểu dữ
 *
 * @author tomnyson
 */
public class Ud1 {

    /**
     * @param args the command line arguments
     */
    public static boolean isNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
        1. nhập vào 1 số từ 10 - 100;
        2. nếu không phải thì bắt nhập 
        3. xuất ra các s nguyên tố từ n - 100;
         */
//        int n;
        Scanner scaner = new Scanner(System.in);
//        System.out.println("Nhập giá trị n: ");
//        do {
//           n = scaner.nextInt();
//        } while(n<10 || n >100);
//        for(int i = n; i < 100; i++) {
//            if(isNguyenTo(i)) {
//            System.out.println("gia tri nguyen to la: "+ i);
//            }
//        }
//        int[] a = {0, 1, 2, 3, 4, 5,6};
        int[] b = new int[5];
        System.out.println("length" + b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println("Nhập giá trị của mảng a vi trí: " + i);
            b[i] = scaner.nextInt();
        }
        System.out.println("xuat ra danh sach chan");
        int dem = 0;
        int sum = 0;
        int max = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                System.out.printf("vị trí  a[%d] giá trị %d", i, b[i]);
                dem++;
            }
            sum += b[i];
            if (max < b[i]) {
                max = b[i];
            }
        } 
        int nhap,bienDem=0;
       
        System.out.println("Ban hay nhap so can tim:");
        nhap = scaner.nextInt();
        for(int i = 0; i < b.length; i++){
            if (nhap==b[i]){
               System.out.println("So ban tim co trong ["+i+"]"+b[i]); 
            bienDem++;
            }
        }
        if(bienDem==0){ 
        System.out.println("So ban tim khong co trong  ");}
        System.out.println("số lượng phần tử chbẳn của mảng là: " + dem);
        System.out.println("gía trị lớn nhất: " + max);
    }
}
