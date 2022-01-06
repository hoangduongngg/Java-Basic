/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05017_hoadon_tiennuoc;

import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J05017_HoaDon_TienNuoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<HoaDon> dshd = new ArrayList<>();
        int stt=0;
        while (t-->0) {
            stt++;
            dshd.add(new HoaDon(stt, in.nextLine(),in.nextLine(),in.nextLine()));
        }
        Collections.sort(dshd);
        for (HoaDon x :dshd) {
            System.out.println(x);
        }
    }
    
}
//3
//Le Thi Thanh
//468
//500
//Le Duc Cong
//160
//230
//Ha Hue Anh
//410
//612