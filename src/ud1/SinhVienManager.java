/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class SinhVienManager {

    public ArrayList<SinhVien> dsSinhvien;

    public SinhVienManager(ArrayList<SinhVien> dsSinhvien) {
        this.dsSinhvien = dsSinhvien;
    }

    public ArrayList<SinhVien> getDsSinhvien() {
        return dsSinhvien;
    }

    public void setDsSinhvien(ArrayList<SinhVien> dsSinhvien) {
        this.dsSinhvien = dsSinhvien;
    }

    public void ThemSinhVien() {
        Scanner scanner = new Scanner(System.in);
        String name;
        Double dtb;
        System.out.println("Nhập Tên Sinh Viên");
        name = scanner.nextLine();
        dtb = scanner.nextDouble();
        SinhVien sv = new SinhVien(name, dtb);
        dsSinhvien.add(sv);
    }

    public void XuatDsSinhVien() {
        if (dsSinhvien.size() > 0) {
            for (SinhVien sv : dsSinhvien) {
                sv.xuatThongTin();
            }
        } else {
            System.out.println("DS sinh viên ");
        }
    }

    public void timTheoHoTen(String ten) {
        for (SinhVien sinhVien : dsSinhvien) {
            if (sinhVien.getTenSV().equals(ten)) {
                sinhVien.xuatThongTin();
            }
        }
    }

    public void SuaTheoHoTen(String ten) {
        Scanner scanner = new Scanner(System.in);
        String luachon;
        for (SinhVien sinhVien : dsSinhvien) {
            if (sinhVien.getTenSV().equals(ten)) {
                sinhVien.xuatThongTin();
                System.out.println("Bạn muốn sủa không");
                luachon = scanner.nextLine();
                if (luachon.equals("yes")) {
                    sinhVien.NhapThongTin();
                }
            }
        }
    }

    public void XoaTheoHoTen(String ten) {
        Scanner scanner = new Scanner(System.in);
        String luachon;
        for (SinhVien sinhVien : dsSinhvien) {
            if (sinhVien.getTenSV().equals(ten)) {
                sinhVien.xuatThongTin();
                System.out.println("Bạn muốn xoá không");
                luachon = scanner.nextLine();
                if (luachon.equals("yes")) {
                    dsSinhvien.remove(sinhVien);
                }
            }
        }
    }
}
