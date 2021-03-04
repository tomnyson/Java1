/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assm;

import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class NhanVien {

    public String manv;
    public String hoten;
    public double luong;

    Scanner scanner = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public String getHoten() {
        return hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getThuNhap() {
        return luong;
    }

    public double getThueTN() {
        if (getThuNhap() < 9) {
            return 0;
        } else if (getThuNhap() < 15) {
            return 0.1;
        } else {
            return 0.12;
        }
    }

    public void xuatThongTin() {
        System.out.println("Mã nhân viên: " + this.getManv());
        System.out.println("Họ tên nhân viên: " + this.getHoten());
        System.out.println("Lương nhân : " + this.getLuong());
        System.out.println("Thu Nhập : " + this.getThuNhap());
        System.out.println("Thuế TN cá  : " + this.getThueTN());
    }

    public void NhapThongTin() {
        /*
            quy định manv: 5 ký tự
            họ và tên: ký tự và khoảng 
            lương: số 
         */
        String maNV = "";
        if (maNV.length() < 3) {
            System.out.println("Mời nhập mã số NV");
            maNV = scanner.nextLine();
        }
        this.setManv(maNV);
        System.out.println("Mời nhập họ và tên");
        this.hoten = scanner.nextLine();
        System.out.println("Mời nhập lương");
        this.luong = scanner.nextDouble();
    }

}
