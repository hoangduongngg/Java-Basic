/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02032_Sap_xep_noi_bot_liet_ke_nguoc;

/**
 *
 * @author hoangduongngg
 */
import java.util.*;
public class J02032 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        byte t = in.nextByte();
        while (t-->0) {
            int n = in.nextInt();
            int[] a = new int [n];
            for (int i=0; i<n; i++) {
                a[i] = in.nextInt();
            }
            Sort.Noi_bot_liet_ke_nguoc(n, a);
        }
    }
}
