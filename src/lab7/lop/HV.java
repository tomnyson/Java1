/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.lop;

/**
 *
 * @author tomnyson
 */
public class HV extends HCN {

    public HV(double canh) {
        super(canh, canh);
    }
    @Override
    public void xuat() {
        System.out.println("Thông tin hình vuông");
        System.out.println("cạnh: " + super.dai);
        System.out.println("chu vi: " + super.getChuvi());
        System.out.println("diện tích: " + super.getDienTich());
    }
}
