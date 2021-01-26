/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

import java.util.Scanner;
import ud1.DongVat;

/**
 *
 * @author tomnyson
 */
public class DungOpp {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
//        String maulong, int sochan, float cannang, String gioitin
        DongVat conmeo = new DongVat();
        
        String monan;
        System.out.println("Hôm nay mèo muốn ăn gì !!!");
        monan = scaner.nextLine();
        conmeo.an(monan);
    }
}
