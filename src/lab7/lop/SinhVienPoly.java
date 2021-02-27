/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.lop;

import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public abstract class SinhVienPoly {

    public String hoten;
    public String nganh;

    public SinhVienPoly(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    public SinhVienPoly() {
    }

    abstract public Double getDiem();

    public String getHocLuc() {

        if (getDiem() < 5) {
            return "yếu";
        } else if (getDiem() < 6.5) {
            return "tb";
        } else if (getDiem() < 7.5) {
            return "khá";
        } else if (getDiem() < 9) {
            return "giỏi";
        } else {
            return "xuất sắc";
        }
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên SV");
        hoten = scanner.nextLine();
        System.out.println("Nhập Ngành học");
        nganh = scanner.nextLine();

    }

    public void xuat() {
        System.out.println("tên nhân viên" + this.hoten);
        System.out.println("lương nhân viên" + this.nganh);
    }
}
