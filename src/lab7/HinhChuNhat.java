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
public class HinhChuNhat {
    /**
     * public | protected | default 
     * private thi sẽ không cho kế thừa
     */
     public double dai, rong;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public HinhChuNhat() {
    }

    public double getDai() {
        return dai;
    }

    public double getRong() {
        return rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    
  public void tinhDienTich() {
      System.out.println("dien tich hinh chu nhat: " + this.dai * this.rong);
  }
}
