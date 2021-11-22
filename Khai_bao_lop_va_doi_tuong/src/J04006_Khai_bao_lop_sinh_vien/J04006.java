/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04006_Khai_bao_lop_sinh_vien;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04006 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        SinhVien a = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextFloat());
        System.out.println(a);
    }
}