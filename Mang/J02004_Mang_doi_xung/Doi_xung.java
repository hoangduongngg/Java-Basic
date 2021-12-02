/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02004_Mang_doi_xung;

/**
 *
 * @author hoangduongngg
 */
public class Doi_xung {
    public static boolean Check ( int a[], int n) {
        int i=0;
        while (i<n-1-i) {
            if ( a[i] != a[n-1-i]) return false;
            i++;
        }
        return true;
    }
}
