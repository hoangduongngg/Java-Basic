package j07028_tinh_gio_chuan;

import java.io.*;
import java.util.*;

public class J07028_Tinh_gio_chuan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner (new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <MonHoc> dsmh = new ArrayList<>();
        while (t-->0) {
            dsmh.add(new MonHoc(in.nextLine()));
        }
        
        in = new Scanner (new File("GIANGVIEN.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList <GiangVien> dsgv = new ArrayList<>();
        while (t-->0) {
            dsgv.add(new GiangVien(in.nextLine()));
        }
        
        in = new Scanner (new File("GIOCHUAN.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList <GioChuan> dsgc = new ArrayList<>();
        
        while (t-->0) {
            String[] str = in.nextLine().split(" ");
            
            int flag = 0;
            for (GioChuan x: dsgc) {
                if(str[0].compareTo(x.getMaGV())==0) {
                    x.setGioChuan(x.getGioChuan() + Double.parseDouble(str[2]));
                    flag = 1;
                }
            }
            
            for (GiangVien gv:dsgv) {
                if(str[0].compareTo(gv.getMaGV())==0 && flag ==0) {
                    dsgc.add(new GioChuan(gv, str[2]));
                }
            }
        }
        
        for (GiangVien gv:dsgv) {
            for (GioChuan x: dsgc) {
                if (x.getMaGV().compareTo(gv.getMaGV())==0) {
                    System.out.println(x);
                }
            }
        }
    }
}
