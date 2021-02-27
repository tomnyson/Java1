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
public class SinhVienBiz extends SinhVienPoly {

    Double diemMarketing, diemSales;

    public SinhVienBiz(Double diemMarketing, Double diemSales, String hoten, String nganh) {
        super(hoten, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public SinhVienBiz() {
    }

    @Override
    public Double getDiem() {
        return (diemMarketing * 2 + diemSales) / 3;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập điểm marketing");
        this.diemMarketing = scanner.nextDouble();
        System.out.println("Nhập điểm sale");
        this.diemSales = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("marketing" + this.diemMarketing);
        System.out.println("sale" + this.diemSales);
        System.out.println("diem tb" + this.getDiem());
    }
}
