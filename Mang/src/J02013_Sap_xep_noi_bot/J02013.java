/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02013_Sap_xep_noi_bot;

/**
 *
 * @author hoangduongngg
 */
import java.util.*;
public class J02013 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] a = new int [n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        Sort.Noi_bot(n, a);
    }
}
