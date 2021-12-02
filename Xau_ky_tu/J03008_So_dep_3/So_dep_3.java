/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03008_So_dep_3;

/**
 *
 * @author hoangduongngg
 */
public class So_dep_3 {
    public static boolean Check (String n) {
        for (int i=0; i<=n.length()/2; i++) {
            int num = n.charAt(i)-'0';
            if (n.charAt(i)!=n.charAt(n.length()-1-i) || SNT(num)==false) return false;
        }
        return true;
    }
    public static boolean SNT(int n) {
        if (n==2) return true;
        if (n<2 || n%2==0) return false;
        for (int i=3; i*i<=n; i+=2)
            if (n%i==0) return false;
        return true;
    }
}
