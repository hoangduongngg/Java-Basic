/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02008_Boi__nho_nhat_cua_n_so_nguyen_duong_dau_tien;

/**
 *
 * @author hoangduongngg
 */
import java.util.*;
public class J02008 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextByte();
        while (t-->0) {
            int n = in.nextInt();
            LCM.N_so_dau_tien(n);
        }
    }
}
