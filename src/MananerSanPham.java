/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomnyson
 */
public class MananerSanPham {
    public static void main(String[] args) { 
    OppLab4 sanpham = new OppLab4();
    sanpham.Nhap();
    double giaBan = sanpham.getGia()
            + sanpham.tinhThueVAT() 
            - sanpham.getGia()*sanpham.getGiamGia();
    System.out.printf("giá bán là %.2f \n", giaBan);
    sanpham.Xuat();
    }
}
