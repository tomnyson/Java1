/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author tomnyson
 */
public class demoString {

    public static void main(String[] args) {
        String hoten = "java 1 fpt ";
        String kytu = "   java 1 fpt   ";
        //xuat chu thuong | toLowerCase
        //chuyển thành chữ in hoa | toUpperCase
        //xoá kỹ tự trắng 2 dầu | toUpperCase
        System.out.println("chữ thường: " + hoten.toUpperCase());
        System.out.println("chữ thường: " + hoten.toUpperCase());
        System.out.println("độ dài truoc: " + kytu.length());
        kytu = kytu.trim();
        System.out.println("độ dài sau: " + kytu.length());
        // tim kiem va thay the
        System.out.println("chuỗi con: " + kytu.substring(0, 4));
        System.out.println("replace all: " + kytu.replaceAll("java", "web"));
        String arrA[] = hoten.split(" ");
        System.out.println("chuỗi con thu 1: " + arrA[0]);
        for (String item : arrA) {
            System.out.println("item: " + item);
        }

        // ham so sanh
        String username = "Admin";
        String password = "123456";
        if (username.equalsIgnoreCase("admin") && password.equals("123456")) {
            System.out.println("dang nhap thanh cong");

        } else {
            System.err.println("dang nhap ko thanh cong");
        }
        // check contain
        String isExist = "FPT Java1";
        System.out.println("isExist.indexOf(\"java\")" + isExist.indexOf("FPT"));
        // nhap vao ho va ten
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên");
        String fullname = scanner.nextLine();

    }
}
