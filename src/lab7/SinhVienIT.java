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
public class SinhVienIT extends  SinhVien{

    public double diemJava;
    public double diemCss;

    public SinhVienIT(double diemJava, double diemCss, String ten) {
        super(ten);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
    }
    
    @Override
    public double getDTB() {
        return (2 * diemJava + diemCss)/3;
    }
}
