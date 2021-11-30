/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05081_danh_sach_mat_hang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05081_Danh_sach_mat_hang {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        ArrayList <MatHang> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        int stt = 0;
        while (t-->0) {
            stt++;
            MatHang mh = new MatHang(stt, in.nextLine(), in.nextLine(),in.nextLine(),in.nextLine());
            ds.add(mh);
        }
        Collections.sort(ds);
        for (Object xObject: ds) {
            System.out.println(xObject);
        }
    }
}
