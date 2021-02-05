/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author tomnyson
 */
public class ThucThi {

    public static void main(String[] args) {
//        HinhChuNhat hcn = new HinhChuNhat(2,4);
//        HinhVuong hv = new HinhVuong(2);
//        hcn.tinhDienTich();
//        hv.tinhDienTich();
//        NhanVien nv = new NhanVien("tomnyson", 300000);
//        TruongPhong tp = new TruongPhong(50000, "tomnyson", 300000);
//        LaoCong lc = new LaoCong(180, "lao cong", 15000);
//        nv.getThuNhap();
//        tp.getThuNhap();
//        lc.getThuNhap();
//        SinhVienIT it = new SinhVienIT(6, 6, "it");
//        SinhVienBiz biz = new SinhVienBiz(6, 5, 3, "biz");
//        System.out.println("tinh diem tb cua it" + it.getDTB());
//         System.out.println("tinh diem tb cua biz" + biz.getDTB());

        DongVat cho = new Cho();
        DongVat ga = new Ga();
        DongVat vit = new Vit();
        cho.speak();
        ga.speak();
        vit.speak();

    }
}
