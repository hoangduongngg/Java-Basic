/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05004_danh_sach_sv_2;

import java.util.Scanner;
/**
 *
 * @author hoangduongngg
 */
public class J05004_Danh_sach_SV_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int t = Integer.parseInt(in.nextLine());
        int stt = 0;
        while (t-->0) {
            stt++;
            SinhVien sv = new SinhVien(stt, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            System.out.println(sv);
        }
    }
}
