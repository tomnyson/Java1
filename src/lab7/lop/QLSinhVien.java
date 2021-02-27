/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.lop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class QLSinhVien {

    public ArrayList<SinhVienPoly> listSV = new ArrayList<>();

    public void them() {
        Scanner scanner = new Scanner(System.in);
        String luachon;
        while (true) {
            System.out.println("Mới chọn loại sinh viên it/biz or exit thoát");
            luachon = scanner.nextLine();
            if (luachon.equalsIgnoreCase("it")) {
                SinhVienPoly it = new SinhVienIT();
                it.nhap();
                listSV.add(it);
            } else if (luachon.equals("biz")) {
                // new it sinh vien 
                SinhVienPoly biz = new SinhVienBiz();
                biz.nhap();
                listSV.add(biz);
            } else {
                break;
            }
        }
    }

    public void xuat() {
        if (listSV.size() > 0) {
            for (SinhVienPoly sv : listSV) {
                sv.xuat();
            }
        } else {
            System.out.println("danh sách rỗng");
        }

    }

    public void xuatGioi() {
        if (listSV.size() > 0) {
            for (SinhVienPoly sv : listSV) {
                if (sv.getHocLuc().equalsIgnoreCase("giỏi")) {
                    sv.xuat();
                }
            }
        } else {
            System.out.println("danh sách rỗng");
        }

    }
    public void sapXepTheoDiem() {
        Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return o1.getDiem().compareTo(o2.getDiem());
            }
        };
        Collections.sort(listSV, comp);
    
    }

}
