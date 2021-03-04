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
public class TiepThi extends NhanVien {

    public double doanhSo;
    public double hueHong;
    Scanner scanner = new Scanner(System.in);
    public TiepThi() {
    
    }
    public TiepThi(double doanhSo, double hueHong, String manv, String hoten, double luong) {
        super(manv, hoten, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + this.getHueHong() * this.getDoanhSo();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Doanh số bán hàng: " + this.getDoanhSo());
        System.out.println("Phân trăm huê hồng: " + this.getHueHong());
    }

    @Override
    public void NhapThongTin() {
        super.NhapThongTin();
        System.out.println("Nhập doanh số bán hàng");
        this.doanhSo = scanner.nextDouble();
        System.out.println("Nhập huê hồng");
        this.doanhSo = scanner.nextDouble();
    }

}
