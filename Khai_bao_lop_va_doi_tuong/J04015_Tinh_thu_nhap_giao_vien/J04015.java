/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015_Tinh_thu_nhap_giao_vien;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Giao_vien gv = new Giao_vien(in.nextLine(), in.nextLine(), in.nextInt());
        System.out.println(gv);
    }
}
