/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.lop;

import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class HCN {

    public double dai;
    public double rong;

    public HCN(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuvi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("chieu dai: " + this.dai);
        System.out.println("chieu rong: " + this.rong);
    }
     public void nhap() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("chieu dai: ");
        this.dai = scanner.nextDouble();
        System.out.println("chieu rong: " + this.rong);
         this.rong = scanner.nextDouble();
    }
}
