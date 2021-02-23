/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tomnyson
 */
public class bieuthucchinhquy {

    public static void main(String[] args) {
        String partem = "[0-9]{9}";
        Pattern pattern = Pattern.compile(partem);
        String email = "123456781";
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            System.out.println("dung dinh dang");
        } else {
             System.out.println("ko dinh dang");
        }
    }
}
