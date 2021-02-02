/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

/**
 *
 * @author tomnyson
 */
public class lab6 {

    public static void main(String[] arg) {
        String hovaten = "Le Hong Son";
        String[] arrHoten = hovaten.split(" ");
        System.out.println("Ho: " + hovaten.split(" ")[0]);
        System.out.println("ho: " + hovaten.substring(0, hovaten.indexOf(" ")).toUpperCase());
        System.out.println("ten substring" + hovaten.substring(hovaten.lastIndexOf(" "), hovaten.length()).toUpperCase());
        System.out.println("Ten: " + hovaten.split(" ")[arrHoten.length - 1]);
    }
}
