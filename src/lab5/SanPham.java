/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class SanPham {

    /**
     * ten/ gia
     */
    public String tenSP;
    public Double gia;

    public SanPham(String tenSP, Double gia) {
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public SanPham() {
    }

    public String getTenSP() {
        return tenSP;
    }

    public Double getGia() {
        return gia;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    // viet ham nhap san pham
    public void NhapSanPham() {
        System.out.println("Thêm chi tiết sản phẩm");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String ten = scanner.nextLine();
        System.out.println("Nhập Giá");
        Double gia = scanner.nextDouble();
        this.setGia(gia);
        this.setTenSP(ten);
    }
    // viet ham xuat san pham
    // viet ham nhap san pham
    public void XuatSanPham() {
        System.out.println("Tên sản phẩm: " + this.getTenSP());
        System.out.println("Giá sản phẩm: " + this.getGia());
    }
}
