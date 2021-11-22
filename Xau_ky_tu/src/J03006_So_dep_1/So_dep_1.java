/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03006_So_dep_1;

/**
 *
 * @author hoangduongngg
 */
public class So_dep_1 {
    public static boolean Check (String n) {
        for (int i=0; i<=n.length()/2; i++) {
            int num = n.charAt(i)-'0';
            if (n.charAt(i)!=n.charAt(n.length()-1-i) || num%2==1) return false;
        }
        return true;
    }
}
