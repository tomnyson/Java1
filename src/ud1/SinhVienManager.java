/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class SinhVienManager {

    // cái này để khởi tạo ds sinh viên rỗng ban đầu:
    public ArrayList<SinhVien> dsSinhvien = new ArrayList<SinhVien>();

    public SinhVienManager(ArrayList<SinhVien> dsSinhvien) {
        this.dsSinhvien = dsSinhvien;
    }

    public ArrayList<SinhVien> getDsSinhvien() {
        return dsSinhvien;
    }

    public SinhVienManager() {
    }

    public void setDsSinhvien(ArrayList<SinhVien> dsSinhvien) {
        this.dsSinhvien = dsSinhvien;
    }

    // them sinh vien vao ds sach
    public void ThemSinhVien() {
        SinhVien sv = new SinhVien();
        sv.NhapThongTin();
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
            if (sinhVien.getTenSV().equalsIgnoreCase(ten)) {
                sinhVien.xuatThongTin();
            }
        }
    }

    public void SuaTheoHoTen(String ten) {
        Scanner scanner = new Scanner(System.in);
        String luachon;
        for (SinhVien sinhVien : dsSinhvien) {
            if (sinhVien.getTenSV().equalsIgnoreCase(ten)) {
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

    public void sapXepByDiem() {
        Collections.sort(dsSinhvien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.valueOf(o1.getDiemTB()).compareTo(Double.valueOf(o2.getDiemTB()));
            }
        });
    }

    public void sapXepByTen() {
        Collections.sort(dsSinhvien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTenSV().compareTo(o2.getTenSV());
            }
        });
    }
}
