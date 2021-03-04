/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assm;

/**
 *
 * @author tomnyson
 */
public class TruongPhong extends NhanVien {

    public double trachNhiem;

    public TruongPhong() {

    }

    public TruongPhong(double trachNhiem, String manv, String hoten, double luong) {
        super(manv, hoten, luong);
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return super.getThuNhap() + this.getTrachNhiem(); //To change body of generated methods, choose Tools | Templates.
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Tiền quản lý: " + this.getTrachNhiem());
    }

    @Override
    public void NhapThongTin() {
        super.NhapThongTin();
        System.out.println("Nhập số tiền quản lý");
        this.trachNhiem = scanner.nextDouble();
    }
}
