/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07019_hoadon_1;

import java.io.*;
import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J07019_HoaDon_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA1.in"));
        ArrayList<SanPham> dssp = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            dssp.add(new SanPham(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine()));
        }
        
        ArrayList<HoaDon> dshoadon = new ArrayList<>();
        in = new Scanner(new File("DATA2.in"));
        t = Integer.parseInt(in.nextLine());
        int stt=0;
        while (t-->0) {
            stt++;
            String[] str = in.nextLine().split(" ");
            for (SanPham sp:dssp) {
                if (str[0].substring(0,2).compareTo(sp.getMaSP())==0) {
                    dshoadon.add(new HoaDon(stt,sp, str[0], str[1]));
                }
            }
        }
        
        for (HoaDon x :dshoadon) {
            System.out.println(x);
        }
    }
    
}
