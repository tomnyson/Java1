/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

import java.util.Scanner;
import ud1.SanPham;

/**
 *
 * @author tomnyson
 */
public class lab4 {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int luachon;
        try {
            do {
                System.out.println("Mời bạn nhập sự lựa chọn");
                System.out.println("1: bài 1");
                System.out.println("2: bài 2");
                System.out.println("3: bài 3");

                luachon = scanner.nextInt();

                switch (luachon) {
                    case 1:
                        bai1();
                        break;
                    case 2:
                        bai2();
                        break;
                    case 3:
                        bai3();
                        break;

                    default:
                        System.out.println("đã chọn sai mời chọn lại");
                        break;
                }
                if (luachon == 0) {
                    System.out.println("bạn đã thoát chương trình");
                }
            } while (luachon != 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void bai1() {
        SanPham sp = new SanPham();
        sp.nhap();
        sp.xuat();
    }

    public static void bai2() {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        sp1.nhap();
        sp2.nhap();
        sp1.xuat();
        sp2.xuat();
    }

    public static void bai3() {
        SanPham sp1 = new SanPham("giày", 400000, 0.2);
        SanPham sp2 = new SanPham("giày", 400000);
        sp1.xuat();
        sp2.xuat();
    }

    public static void main(String[] args) {
        menu();
    }
}
