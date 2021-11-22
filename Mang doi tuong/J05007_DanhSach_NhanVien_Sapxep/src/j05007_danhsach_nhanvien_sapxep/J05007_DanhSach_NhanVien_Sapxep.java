/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05007_danhsach_nhanvien_sapxep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author hoangduongngg
 */
public class J05007_DanhSach_NhanVien_Sapxep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        ArrayList <NhanVien>ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        int stt = 0;
        while (t-->0) {
            stt++;
            NhanVien nv = new NhanVien (stt, in.nextLine(),in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(nv);
        }
        Collections.sort(ds);
        for (Object x:ds) {
            System.out.println(x);
        }
        
    }
}

