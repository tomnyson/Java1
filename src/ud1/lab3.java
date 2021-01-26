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
public class lab3 {

    public static void main(String[] args) {
        /**
         * tính trung bình cộng của ma trận 2 chiều nhập dòng cột nhập ma trận
         * tính má trận
         */

        int dong, cot;
        int tongle = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dòng của ma trận");
        do {
            dong = scanner.nextInt();
        } while (dong < 0);
        System.out.println("nhập số cột của ma trận");
        do {
            cot = scanner.nextInt();
        } while (cot < 0);
        int[][] matran = new int[dong][cot];

        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Nhập dữ liệu cho matran[%d][%d]", i, j);
                matran[i][j] = scanner.nextInt();
            }
        }
        System.out.println("xuất ma trận dữ liệu cho ma trân");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("matran[%d][%d] = %d \n", i, j, matran[i][j]);
            }
        }
        System.out.println("tính tổng ma trận lẻ");
        System.out.println("xuất ma trận dữ liệu cho ma trân");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (matran[i][j] % 2 != 0) {
                    tongle += matran[i][j];
                }
            }
        }
        System.out.printf("tổng các số le của ma trân %d", tongle);
        System.out.println("sắp xếp ma trận 2 ");
        BubbleSortA(matran, dong, cot);
        xuatMang(matran, dong, cot);
    }

    public static void BubbleSortA(int A[][], int m, int n) {
        for (int k = 0; k < m; k++) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = n - 1; j > i; j--) {
                    if (A[k][j] < A[k][j - 1]) {
                        int temp = A[k][j];
                        A[k][j] = A[k][j - 1];
                        A[k][j - 1] = temp;
                    }
                }
            }
        }
    }
    public static void xuatMang(int matran[][], int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                 System.out.printf("matran[%d][%d] = %d \n", i, j, matran[i][j]);
            }
        }
    }
}
