/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04012_Bai_toan_tinh_cong;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Nhan_vien nv = new Nhan_vien(in.nextLine(), in.nextLong(), in.nextLong(), in.next());
        System.out.println(nv);
    }
}
