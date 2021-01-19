/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

import java.util.Properties;
import java.util.Scanner;

/**
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
          double[] b = new double[5];
          System.out.println("length"+b.length);
         for(int i=0; i< b.length; i++) {
             System.out.println("Nhập giá trị của mảng a vi trí: "+ i);
              b[i] = scaner.nextDouble();
        }
        for(int i=0; i< b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
