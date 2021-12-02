/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05021_sapxep_sinhvien_theoma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05021_SapXep_SinhVien_theoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <SinhVien> ds = new ArrayList<>();
        while (in.hasNextLine()) {
            SinhVien hs = new SinhVien (in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(hs);
        }
        Collections.sort(ds);
        for (Object xObject:ds) {
            System.out.println(xObject);
        }
    }
    
}
