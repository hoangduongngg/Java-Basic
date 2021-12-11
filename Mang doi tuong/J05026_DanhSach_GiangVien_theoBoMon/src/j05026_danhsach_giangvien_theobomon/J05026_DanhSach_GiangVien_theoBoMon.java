/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05026_danhsach_giangvien_theobomon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05026_DanhSach_GiangVien_theoBoMon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<GiangVien> ds_gv = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        int stt = 0;
        while (t-->0) {
            stt++;
            GiangVien gv = new GiangVien (stt, in.nextLine(), in.nextLine());
            ds_gv.add(gv);
        }
        
        ArrayList <String> ds_bm = new ArrayList<>();
        int Q = Integer.parseInt(in.nextLine());
        while (Q-->0) {
            ds_bm.add(xuly_BoMon(in.nextLine()));
        }
        for (String BoMon:ds_bm) {
            System.out.println("DANH SACH GIANG VIEN BO MON " + BoMon + ":");
            for (GiangVien xObject:ds_gv) {
                if (BoMon.compareTo(xObject.getBoMon())==0) {
                    System.out.println(xObject);
                }
            }
        }
    }
    
    public static String xuly_BoMon (String BoMon) {
        String res = "";
        String[] mon_list = BoMon.toUpperCase().split(" ");
        for (String x:mon_list) {
            res += x.charAt(0);
        }
        return res;
    }
 
    
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//Cong nghe phan mem
