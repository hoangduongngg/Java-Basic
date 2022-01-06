/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05060_ketqua_xettuyen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05060_KetQua_XetTuyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> dssv = new ArrayList<>();
        int stt=0;
        while (t-->0) {
            stt++;
            dssv.add(new SinhVien(stt, in.nextLine(),  in.nextLine(), in.nextLine(),  in.nextLine()));
        }
        
        for (SinhVien x :dssv) {
            System.out.println(x);
        }
    }
    
}
//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9