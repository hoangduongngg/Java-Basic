/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04007_Khai_bao_lop_nhan_vien;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04007 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        NhanVien a = new NhanVien(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
        System.out.println(a);
    }
}
