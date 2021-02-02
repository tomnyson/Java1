/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class baiTapLab5 {

    public static void bai1() {
        ArrayList<Double> ds = new ArrayList<Double>();
        /**
         * b1 nhap vao danh sach cua list b2: tinh tong
         */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Double x = scanner.nextDouble();
            ds.add(x);
            if (x.equals("n")) {
                break;
            }
        }
        // tính tổng của list
        Double tong = 0.0;
        for (Double item : ds) {
            tong += item;
        }
        System.out.println("tổng của list là: " + tong);

    }

    public static void bai2() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dsten = new ArrayList<String>();
        while (true) {
            String hovaten = scanner.nextLine();
            dsten.add(hovaten);
            if (hovaten.equals("n")) {
                break;
            }
        }
        // xuat danh sach 
        System.out.println("Xuất danh sách");
        for (String ten : dsten) {
            System.out.println("Họ và tên: " + ten);
        }
        //xuất ngâũ nhiên
        Collections.shuffle(dsten);
        for (String ten : dsten) {
            System.out.println("Họ và tên: " + ten);
        }
        // sắp xếp giảm dần
        Collections.sort(dsten); // tăng dần list
        Collections.reverse(dsten); // đảo ngược list lại
        for (String ten : dsten) {
            System.out.println("Họ và tên: " + ten);

        }
        //tim và xoá
        String tukhoa = scanner.nextLine();
          System.out.println("Tìm và xoá: "+ tukhoa);
          for (String ten : dsten) {
           if(ten.equals(tukhoa)) {
              int index = dsten.indexOf(tukhoa);
              dsten.remove(index);
           }
            System.out.println("Họ và tên: " + ten);

        }
    }

    

    public static void main(String[] args) {

    }
}
