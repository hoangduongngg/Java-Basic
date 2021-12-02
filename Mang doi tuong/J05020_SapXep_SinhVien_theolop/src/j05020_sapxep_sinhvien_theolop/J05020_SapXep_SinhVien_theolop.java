/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05020_sapxep_sinhvien_theolop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05020_SapXep_SinhVien_theolop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <SinhVien> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            SinhVien hs = new SinhVien (in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(hs);
        }
        Collections.sort(ds);
        for (Object xObject:ds) {
            System.out.println(xObject);
        }
    }
}