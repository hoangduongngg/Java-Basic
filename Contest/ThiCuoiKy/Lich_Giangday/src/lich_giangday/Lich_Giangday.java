/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lich_giangday;

import java.io.*;
import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class Lich_Giangday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <MonHoc> dsmh = new ArrayList<>();
        while (t-->0) {
            dsmh.add(new MonHoc(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        
        in = new Scanner(new File("LICHGD.in"));
        t = Integer.parseInt(in.nextLine());
        int stt=0;
        ArrayList <LichGD> dsgd = new ArrayList<>();
        while (t-->0) {
            stt++;
            dsgd.add(new LichGD(stt, in.nextLine(), in.nextLine(), in.nextLine(),in.nextLine(),in.nextLine()));
        }
        
        String MonString = in.nextLine();
        String TenMonString = "";
        for (MonHoc mh:dsmh) {
            if (mh.getMaMH().compareTo(MonString)==0) {
                TenMonString = mh.getTenMH();
            }
        }
        System.out.println("LICH GIANG DAY MON " + TenMonString +":");
        
        Collections.sort(dsgd);
        for (LichGD x:dsgd) {
            if (x.getMaMH().compareTo(MonString)==0) {
                System.out.println(x);
            }
        }
    }
    
}
