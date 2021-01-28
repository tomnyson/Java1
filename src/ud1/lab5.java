/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud1;

import java.util.ArrayList;

/**
 *
 * @author tomnyson
 */
public class lab5 {
    /**
     * 1. định nghĩa một arraylist string add vào 3 tên sinh viên
     * d
     */
    
    public static void main(String[] args) {
        ArrayList<String> danhsach = new ArrayList<String>();
        danhsach.add("a");
        danhsach.add("b");
        danhsach.add("c");
        // remove một phần tử từ vị trí thứ i
//        danhsach.remove(0);
//        danhsach.set(0, "c");
        // lấy phần tử thứ 
        System.out.println("ds thu 0: "+ danhsach.get(0));
        
        // tìm phẩn từ có hay không và trả về vị trí trong arrayList
        
         System.out.println("index of: "+ danhsach.indexOf("c"));
         
        // duyêt array list 
        for(int i=0; i < danhsach.size(); i++) {
            System.out.println("phần thử thứ" + i + danhsach.get(i));
        }
         System.out.println("------------------");
        for(String bien: danhsach) {
            System.out.println("phần thử thứ" + bien);
        }
        
        
    }
   
    
}
