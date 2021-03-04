/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import lab7.lop.SinhVienPoly;

/**
 *
 * @author tomnyson
 */
public class QLNhanVien {

    public ArrayList<NhanVien> qlNhanVien = new ArrayList<NhanVien>();
    Scanner scanner = new Scanner(System.in);

    public void ThemDanhSachNV() {
        System.out.println("Nhập số lượng nhân viên cần thêm vào");
        int soNV = scanner.nextInt();
        for (int i = 0; i < soNV; i++) {
            System.out.println("Thêm Nhân viên thứ: " + i);
            System.out.println("Để thêm nhân viên: 0: hành chính, 1: tiếp thị, 2: trưởng phòng");
            String luachon = scanner.nextLine();
            NhanVien nv = new NhanVien();
            switch (luachon) {
                case "0":
                    nv = new NhanVien();
                    break;
                case "1":
                    nv = new TiepThi();
                case "2":
                    nv = new TruongPhong();
                    break;
            }
            nv.NhapThongTin();
            qlNhanVien.add(nv);
        }

    }

    public void XuatDanhSach() {
        if (qlNhanVien.size() > 0) {
            for (NhanVien nv : qlNhanVien) {
                nv.xuatThongTin();
            }
        } else {
            System.out.println("Danh sách nhân viên rỗng");
        }
    }

    public void TimNhanVienTheoMa() {
        System.out.println("Nhập vào mã nhân viên");
        String keyword = scanner.nextLine();
        for (NhanVien nv : qlNhanVien) {
            if (nv.getManv().equalsIgnoreCase(keyword)) {
                nv.xuatThongTin();
            }

        }
    }

    public void xoaNhanVien() {
        System.out.println("Nhập vào mã nhân viên");
        String keyword = scanner.nextLine();
        for (NhanVien nv : qlNhanVien) {
            if (nv.getManv().equalsIgnoreCase(keyword)) {
                qlNhanVien.remove(nv);
            }

        }
    }

    public void capNhatThongTin() {
        System.out.println("Nhập vào mã nhân viên");
        String keyword = scanner.nextLine();
        int vt = 0;
        for (NhanVien nv : qlNhanVien) {
            if (nv.getManv().equalsIgnoreCase(keyword)) {
                qlNhanVien.remove(nv);
                nv.NhapThongTin();
                qlNhanVien.add(vt, nv);
            }
            vt++;
        }
    }

    public void TimNhanVienTheoKhoangLuong() {
        System.out.println("Nhập vào lương min");
        double min = scanner.nextDouble();
        System.out.println("Nhập vào lương max");
        double max = scanner.nextDouble();
        for (NhanVien nv : qlNhanVien) {
            if (nv.getThuNhap() >= min && nv.getThuNhap() <= max) {
                nv.xuatThongTin();
            }
        }
    }

    public void sapXepTheoHotenTangDan() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoten().compareTo(o2.getHoten());
            }
        };
        Collections.sort(qlNhanVien, comp);
    }

    public void sapXepTheoHotenGiamDan() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o2.getHoten().compareTo(o1.getHoten());
            }
        };
        Collections.sort(qlNhanVien, comp);
    }
    
      public void sapXepTheoThuNhapTang() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.valueOf(o2.getThuNhap()).compareTo(o1.getThuNhap());
            }
        };
        Collections.sort(qlNhanVien, comp);
    }
        public void getNhanVienTop(int rank) {
        for(int i =0 ; i< rank; i++) {
            qlNhanVien.get(i).xuatThongTin();
        }
    }

}
