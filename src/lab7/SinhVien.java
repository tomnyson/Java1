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
abstract public class SinhVien {
    public String ten;

    public SinhVien(String ten) {
        this.ten = ten;
    }
    abstract public double getDTB();
}
