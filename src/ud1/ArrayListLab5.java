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
import java.util.ArrayList;

public class ArrayListLab5 {

    /**
     * làm việc với tập hơp trong java
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("son");
        list.add("tung");
        list.add("nam");
        //
        System.out.println("list 1" + list.get(1));
        list.remove(0);
        list.size();
        System.out.println("list : " + list.indexOf("nam"));

        // duyệt list
        for (int i = 0; i < list.size(); i++) {
            String x = list.get(i);
            System.out.println("x: " + x);
        }
        for (String t:list) {
          System.out.println("x: " + t);
        }
    }

}
