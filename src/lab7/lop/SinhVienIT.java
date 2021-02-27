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
public class SinhVienIT extends SinhVienPoly {

    Double diemJava, diemCss, diemHtml;

    public SinhVienIT(Double diemJava, Double diemCss, Double diemHtml, String hoten, String nganh) {
        super(hoten, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public SinhVienIT() {
        super();
    }

    @Override
    public Double getDiem() {
        return (diemJava * 2 + diemCss + diemHtml) / 4;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập điểm java");
        this.diemJava = scanner.nextDouble();
        System.out.println("Nhập điểm css");
        this.diemCss = scanner.nextDouble();
        System.out.println("Nhập điểm html");
        this.diemHtml = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Java" + this.diemJava);
        System.out.println("Css" + this.diemCss);
        System.out.println("Html" + this.diemHtml);
        System.out.println("diem tb" + this.getDiem());
    }

}
