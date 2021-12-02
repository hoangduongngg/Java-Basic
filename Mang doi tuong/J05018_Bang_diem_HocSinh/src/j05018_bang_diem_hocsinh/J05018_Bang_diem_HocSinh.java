/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05018_bang_diem_hocsinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05018_Bang_diem_HocSinh {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <HocSinh> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        int stt=0;
        while (t-->0) {
            stt++;
            HocSinh hs = new HocSinh(stt, in.nextLine(), in.nextLine());
            ds.add(hs);
        }
        Collections.sort(ds);
        for (Object xObject:ds) {
            System.out.println(xObject);
        }
    }
}
