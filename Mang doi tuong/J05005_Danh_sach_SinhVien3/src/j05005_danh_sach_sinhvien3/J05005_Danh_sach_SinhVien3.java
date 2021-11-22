/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05005_danh_sach_sinhvien3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05005_Danh_sach_SinhVien3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        ArrayList <SinhVien> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        int stt = 0;
        while (t-->0) {
            stt++;
            SinhVien sv = new SinhVien(stt, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(sv);
        }
        
        Collections.sort(ds);
        for (SinhVien x:ds) {
            System.out.println(x);
        }
    }
}

