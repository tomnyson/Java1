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
public class LaoCong extends  NhanVien {

    public LaoCong(double sogio, String ten, double luong) {
        super(ten, luong);
        this.sogio = sogio;
    }

    public LaoCong(double sogio) {
        this.sogio = sogio;
    }
    public double  sogio;

    public double getSogio() {
        return sogio;
    }

    public String getTen() {
        return ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setSogio(double sogio) {
        this.sogio = sogio;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
     public void getThuNhap() {
        System.out.println("lương tc: " + super.getLuong() * this.sogio);
    }
    
}
