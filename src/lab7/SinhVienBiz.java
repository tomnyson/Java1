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
public class SinhVienBiz extends SinhVien {
    public double keToan;
    public double marketting;
    public double banHang;

    public SinhVienBiz(double keToan, double marketting, double banHang, String ten) {
        super(ten);
        this.keToan = keToan;
        this.marketting = marketting;
        this.banHang = banHang;
    }

    
    @Override
    public double getDTB() {
        return (keToan + marketting + banHang)/3;
    }

}
