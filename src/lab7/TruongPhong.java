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
public class TruongPhong extends NhanVien {

    public double tienTrachNhiem;

    public TruongPhong(double tienTrachNhiem, String ten, double luong) {
        super(ten, luong);
        this.tienTrachNhiem = tienTrachNhiem;
    }

    public void xuat() {
        super.xuat();
        System.out.println("tiền trách nhiệm: " + this.tienTrachNhiem);
    }

    public void getThuNhap() {
        System.out.println("lương tp: " + super.getLuong() + this.tienTrachNhiem);
    }
}
