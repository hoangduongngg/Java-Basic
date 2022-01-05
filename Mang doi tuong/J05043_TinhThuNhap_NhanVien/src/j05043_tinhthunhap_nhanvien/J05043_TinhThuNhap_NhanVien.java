/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05043_tinhthunhap_nhanvien;

import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J05043_TinhThuNhap_NhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        int stt = 0;
        while (t-->0) {
            stt++;
            dsnv.add(new NhanVien(stt, in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine()));
        }
        
        for (Object x:dsnv) {
            System.out.println(x);
        }
    }
    
}
//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28