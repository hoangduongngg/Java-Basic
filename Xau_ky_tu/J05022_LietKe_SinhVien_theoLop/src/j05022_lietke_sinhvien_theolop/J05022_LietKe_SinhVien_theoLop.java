/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05022_lietke_sinhvien_theolop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05022_LietKe_SinhVien_theoLop {

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
        
        ArrayList <String> ds_lop = new ArrayList<>();
        int q = Integer.parseInt(in.nextLine());
        while (q-->0) {
            String lop = in.nextLine();
            ds_lop.add(lop);
        }
        
        //Collections.sort(ds);
        for (String classString:ds_lop) {
            System.out.println("DANH SACH SINH VIEN LOP " + classString + ":");
            for (SinhVien x:ds) {
                if (x.getLop().compareTo(classString)==0) {
                    System.out.println(x);
                }
            }
        }
    }
}
