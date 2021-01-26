
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tomnyson khai báo lớp sản cần: ? hàm khởi tạo
 */
public class OppLab4 {

    public String tenSp;
    public Double gia;
    public Double giamGia;

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }
    
    public String getTenSp() {
        return tenSp;
    }

    public Double getGia() {
        return gia;
    }

    public Double getGiamGia() {
        return giamGia;
    }
    
    public OppLab4() {

    }

    //ham khoi tao day du tham so
    public OppLab4(String ten, double gia, double giamGia) {
        this.tenSp = ten;
        this.gia = gia;
        this.giamGia = giamGia;
    }

    // hankhoi tao voi ten va gia , giam gia = 0;
    public OppLab4(String ten, double gia) {
        this.tenSp = ten;
        this.gia = gia;
        this.giamGia = 0.0;
    }

    public double tinhThueVAT() {
        return this.gia * 0.1;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin chi tiết của sản phẩm");
        System.out.println("Nhập tên sp");
        this.tenSp = scanner.nextLine();
        System.out.println("Nhập gía sp");
        this.gia = scanner.nextDouble();
        System.out.println("Nhập giảm giá sp");
        this.giamGia = scanner.nextDouble();
    }

    public void Xuat() {
        System.out.println("thông tin chi tiết của sản phẩm");
        System.out.println("Nhập tên sp: " + this.tenSp);
        System.out.println("Nhập gía sp" + this.gia);
        System.out.println("Nhập giảm giá sp" + this.giamGia);
    }
}
