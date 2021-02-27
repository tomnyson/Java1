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
// extends có nghĩa là kế thừa từ một lớp
public class NhanVienIT extends NhanVien {

    public double thuongduan;

    public NhanVienIT(String ten, double luong, double thuongduan) {
        // dùng lại hàm khỏi tạo của thằng cha thông qua bến supper
        super(ten, luong);
        this.thuongduan = thuongduan;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        this.thuongduan = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        System.out.println("Đây là nhân viên it");
        System.out.println("Thưởng dự án" + this.thuongduan);
    }

    @Override
    public double tinhluong() {
        return super.getLuong() + this.thuongduan;
    }
}
