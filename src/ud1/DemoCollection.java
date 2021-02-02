/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

/**
 *
 * @author tomnyson
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoCollection {

    public static void main(String[] args) {
        ArrayList<Integer> danhsach = new ArrayList<Integer>();
        ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
        danhsach.add(1);
        danhsach.add(4);
        danhsach.add(3);
        danhsach.add(5);
        //xuat danh sach 
        for (Integer item : danhsach) {
            System.out.println("item: " + item);
        }
        // dao mang
        System.out.println("--------------------------");
        // random mang mang
//        Collections.shuffle(danhsach);
        // đảo ngược mảng
//      Collections.reverse(danhsach);
// sắp xếp
//      Collections.sort(danhsach);
//        for (Integer item : danhsach) {
//            System.out.println("item: " + item);
//        }
        SinhVien sv1 = new SinhVien("a", 5.0);
        SinhVien sv2 = new SinhVien("b", 4.0);
        SinhVien sv3 = new SinhVien("c", 7.0);
        dsSV.add(sv1);
        dsSV.add(sv2);
        dsSV.add(sv3);
        System.out.println("------------xuat danh sach sinh vien--------------");
         for (SinhVien sv : dsSV) {
            sv.xuatThongTin();
        }
         System.out.println("----com--------xuat danh sach sau khi sort vien--------------");
//         Comparator<SinhVien> comp = new Comparator<SinhVien>() {
//             @Override
//             public int compare(SinhVien sv1, SinhVien sv2) {
//                return Double.valueOf(sv1.getDiemTB()).compareTo(Double.valueOf(sv2.getDiemTB()));
//             }
//         };
         Collections.sort(dsSV);
          System.out.println("----com--------xuat danh sach sau khi sort vien---------");
         for (SinhVien sv : dsSV) {
            sv.xuatThongTin();
        }
    }
}
