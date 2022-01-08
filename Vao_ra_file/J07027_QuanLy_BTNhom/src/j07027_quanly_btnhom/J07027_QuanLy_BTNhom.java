/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07027_quanly_btnhom;

import java.io.*;
import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J07027_QuanLy_BTNhom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> dssv = new ArrayList<>();
        for (int i=0; i<n; i++) {
            dssv.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        
        in = new Scanner(new File("BAITAP.in"));
        int m = Integer.parseInt(in.nextLine());
        int stt=0;
        ArrayList<BaiTap> dsbt = new ArrayList<>();
        while (m-->0) {
            stt++;
            dsbt.add(new BaiTap(stt, in.nextLine()));
        }
        
        in = new Scanner(new File("NHOM.in"));
        ArrayList<Nhom> dsn = new ArrayList<>();
        while (n-->0) {
            String[] str = in.nextLine().split(" ");
            SinhVien sinhVien = new SinhVien();
            BaiTap baiTap = new BaiTap();
            
            for (SinhVien sv:dssv) {
                if (str[0].compareTo(sv.getMaSV())==0) {
                    sinhVien = sv;
                    break;
                }
            }
            
            for (BaiTap bt:dsbt) {
                if (Integer.parseInt(str[1]) == bt.getNhom()) {
                    baiTap = bt;
                    break;
                }
            }
            dsn.add(new Nhom(sinhVien, baiTap));
        }
        Collections.sort(dsn);
        for (Nhom nhom:dsn) {
            System.out.println(nhom);
        }
    }
    
}
