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
/**
 * kế thừa dùng từ khoá extends
 * @author tomnyson
 */
public class HinhVuong extends HinhChuNhat{

    public HinhVuong(double dai) {
        super(dai, dai);
    }
    public void tinhDienTich() {
         System.out.println("dien tich hinh HinhVuong" + super.getDai()* super.getDai());
    }
}
