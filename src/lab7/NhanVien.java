/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

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

    public NhanVien() {
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

    public void xuat() {
        System.out.println("họ và tên: " + this.ten);
        System.out.println("lương: " + this.luong);
    }
    public void getThuNhap() {
       System.out.println("lương nv: " + this.luong);
    }
}
