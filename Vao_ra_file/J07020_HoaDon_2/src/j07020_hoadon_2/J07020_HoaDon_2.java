/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07020_hoadon_2;

import java.io.*;
import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J07020_HoaDon_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("KH.in"));
        int t, stt;
        t = Integer.parseInt(in.nextLine());
        stt=0;
        ArrayList<KhachHang> dskh = new ArrayList<>();
        while (t-->0) {
            stt++;
            dskh.add(new KhachHang(stt, in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine()));
        }
        
        in = new Scanner(new File("MH.in"));
        t = Integer.parseInt(in.nextLine());
        stt=0;
        ArrayList<MatHang> dsmh = new ArrayList<>();
        while (t-->0) {
            stt++;
            dsmh.add(new MatHang(stt, in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine()));
        }
        
        in = new Scanner(new File("HD.in"));
        t = Integer.parseInt(in.nextLine());
        stt=0;
        ArrayList<HoaDon> dshd = new ArrayList<>();
        while (t-->0) {
            stt++;
            String[] str = in.nextLine().split(" ");
            KhachHang khachHang = new KhachHang();
            MatHang matHang = new MatHang();
            Integer SoLuong = Integer.parseInt(str[2]);
            for (KhachHang kh :dskh) {
                if (str[0].compareTo(kh.getMaKH())==0) {
                    khachHang=kh;
                    break;
                }
            }
            for (MatHang mh:dsmh) {
                if (str[1].compareTo(mh.getMaMH())==0) {
                    matHang = mh;
                    break;
                }
            }            
            dshd.add(new HoaDon(stt, khachHang, matHang, SoLuong));
        }
        
        for (HoaDon x :dshd) {
            System.out.println(x);
        }
    }
    
}
