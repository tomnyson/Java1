/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class Array2chieu {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        /**
         * khai bao mang 2 chieu; nhap vao dong, nhap cot nhập dữ liệu mảng 2
         * chiều xuất mảng 2 cần 2 vòng for 
         */
        int[][] mang2chieu = {{1, 2}, {2, 3}, {3, 4}};
        for(int dong = 0; dong <=2; dong++) {
            for(int cot =0; cot <=1 ; cot++) {
                System.out.printf("mang mang2chieu[%d][%d] gía trị: %d \n", dong,cot,mang2chieu[dong][cot]);
            }
        }
       
    }
}
