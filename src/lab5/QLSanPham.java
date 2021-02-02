/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class QLSanPham {

    public ArrayList<SanPham> dsSP = new ArrayList<SanPham>();

    public QLSanPham() {
    }

    public ArrayList<SanPham> getDsSP() {
        return dsSP;
    }

    public void setDsSP(ArrayList<SanPham> dsSP) {
        this.dsSP = dsSP;
    }
    // add san pha vao list

    public void ThemSanPhamInList() {
        System.out.println("Thêm một sản phẩm vào list");
        SanPham sp = new SanPham();
        sp.NhapSanPham();
        dsSP.add(sp);
    }

    // xuat ds san pham
    public void XuatDSSanPham() {
        for (SanPham sp : dsSP) {
            sp.XuatSanPham();
        }
    }

    public void sapXepTheoGia() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.getGia().compareTo(o2.getGia());
            }
        };
        Collections.sort(dsSP, comp);
    }
    
    // tim kiem va xoa
    /**
     * can tu khoa
     * 
     */
    public void timKiemVaoXao(String tukhoa) {
        Scanner scanner = new Scanner(System.in);
          for (SanPham sp : dsSP) {
              if(sp.getTenSP().equals(tukhoa)) {
              // tim thay;
               sp.XuatSanPham();
                  System.out.println("bạn có muốn xoá sp này y/n ");
                  String luachon = scanner.nextLine();
                  if(luachon.equals("y")) {
                   dsSP.remove(sp);
                  }
               
          }
            sp.XuatSanPham();
        }
    }
}
