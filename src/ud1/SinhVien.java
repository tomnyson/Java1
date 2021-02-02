/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class SinhVien implements Comparable< SinhVien> {

    /**
     * sinh vien gồn tên/ điểm t
     */
    public String tenSV;
    public double diemTB;

    public SinhVien(String tenSV, double diemTB) {
        this.tenSV = tenSV;
        this.diemTB = diemTB;
    }

    public SinhVien() {
    }

    public String getTenSV() {
        return tenSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setDiemTB(double diemTB) {
        if (diemTB > 0 && this.diemTB <= 10) {
            this.diemTB = diemTB;
        }

    }

    public void xuatThongTin() {
        System.out.println("Tên Sinh Viên: " + this.getTenSV());
        System.out.println("Điểm Sinh Viên: " + this.getDiemTB());
        System.out.println("Học lực: " + getHocLuc());
    }

    public void NhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên Sinh Viên");
        String ten = scanner.nextLine();
        Double diem = scanner.nextDouble();
        setTenSV(ten);
        setDiemTB(diem);
    }

    public String getHocLuc() {
        String hocluc = "Xuất sắc";
        if (this.diemTB < 5) {
            hocluc = "Yếu";
        } else if (this.diemTB < 6.5) {
            hocluc = "Trung Bình";
        } else if (this.diemTB < 8) {
            hocluc = "Khá";
        } else if (this.diemTB < 9) {
            hocluc = "Giỏi";
        }
        return hocluc;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "tenSV=" + tenSV + ", diemTB=" + diemTB + '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.valueOf(this.getDiemTB()).compareTo(Double.valueOf(o.getDiemTB()));
    }

}
