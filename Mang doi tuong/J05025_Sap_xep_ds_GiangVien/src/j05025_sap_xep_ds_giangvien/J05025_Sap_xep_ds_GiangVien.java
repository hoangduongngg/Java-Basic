/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05025_sap_xep_ds_giangvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05025_Sap_xep_ds_GiangVien {

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
        Collections.sort(ds_gv);
        for (Object xObject:ds_gv) {
            System.out.println(xObject);
        }
    }
    
}

//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin