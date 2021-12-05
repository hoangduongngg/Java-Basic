/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05023_lietke_sinhvien_theokhoa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05023_LietKe_SinhVien_theoKhoa {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <SinhVien> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            SinhVien sv = new SinhVien (in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(sv);
        }
        
        ArrayList <String> ds_khoa = new ArrayList<>();
        int q = Integer.parseInt(in.nextLine());
        while (q-->0) {
            String khoa = in.nextLine();
            
            ds_khoa.add(""+khoa.charAt(2) + khoa.charAt(3));
        }
        
        for (String khoaString:ds_khoa) {
            System.out.println("DANH SACH SINH VIEN KHOA 20" + khoaString + ":");
            for (SinhVien x:ds) {
                if (x.getKhoa().compareTo(khoaString)==0) {
                    System.out.println(x);
                }
            }
        }
    }
    
}

