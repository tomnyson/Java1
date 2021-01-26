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
public class DongVat {

    public String maulong;
    public int sochan;
    public float cannang;
    public String gioitinh;

    public DongVat() {

    }

    public DongVat(String maulong, int sochan, float cannang, String gioitinh) {
        this.maulong = maulong;
        this.sochan = sochan;
        this.cannang = cannang;
        this.gioitinh = gioitinh;
    }

    public DongVat(String maulong, float cannang) {
        this.maulong = maulong;
        this.cannang = cannang;
    }

    public void an() {
        System.out.println("cho động vật ăn!!");
    }

    public void an(String mon) {
        System.out.printf("cho động vật đang ăn %s", mon);
    }

    public void xuatThongTin() {
        System.out.println("thông tin con vật");
        System.out.println("màu lông: " + this.maulong);
    }

    public String getMaulong() {
        return maulong;
    }
    
    public int getSoChan() {
        return sochan;
    }
    
    public float getCanNang() {
        return cannang;
    }
    
    public String getGioiTinh() {
        return gioitinh;
    }
    public void setCanNang(float can) {
        this.cannang = can;
    }
    
}
