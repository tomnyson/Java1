package ud1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tomnyson
 * 1: thuộc tính
 * 2. constructor
 * 3. hàm
 * 4 get/
 */

public class SanPham {

    public String tenSP;
    public double giaSP;
    public double giamGia;
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public SanPham() {
    }

    public SanPham(String tenSP, double giaSP, double giamGia) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double giaSP) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.giamGia = 0;
    }

    private double getThueNhapKhau() {
        return giaSP * 0.1;
    }

    public void nhap() {
        System.out.println("Nhập thông tin sản phẩm sản phẩm");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm");
        this.tenSP = scanner.nextLine();
        System.out.println("Nhập giá bán");
        this.giaSP = scanner.nextDouble();
        System.out.println("Nhập giảm giá");
        this.giamGia = scanner.nextDouble();

    }

    public void xuat() {
        System.out.printf("Tên sản phẩm: %s \n", this.tenSP);
        System.out.printf("gía sản phẩm: %.3f \n", this.giaSP);
        System.out.printf("giảm giá sản phẩm: %.3f \n", this.giamGia);
        System.out.printf("tính thuế nhâp khẩu (Vat 10%): %.3f \n", this.getThueNhapKhau());

    }

}
