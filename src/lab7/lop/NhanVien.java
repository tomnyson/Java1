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
public class NhanVien {
    public String ten;
    public double luong;

    public NhanVien(String ten, double luong) {
        this.ten = ten;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public void nhap() {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên");
        this.ten = scanner.nextLine();
        System.out.println("Nhập Lương nhân viên");
        this.luong = scanner.nextDouble();
    }
     public void xuat() {
        System.out.println("tên nhân viên" + this.ten);
        System.out.println("lương nhân viên" + this.luong);
    }
    
}
