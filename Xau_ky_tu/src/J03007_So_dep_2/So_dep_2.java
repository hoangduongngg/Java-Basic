/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03007_So_dep_2;

/**
 *
 * @author hoangduongngg
 */
public class So_dep_2 {
    public static boolean Check (String n) {
        if (n.charAt(0)!='8' || n.charAt(n.length()-1)!='8') return false;
        int sum=16;
        for (int i=1; i<n.length()/2; i++) {
            int num = n.charAt(i)-'0';
            if (n.charAt(i)!=n.charAt(n.length()-1-i)) return false;
            sum+=num*2;
        }
        
        if (n.length()%2==1) sum+=(n.charAt(n.length()/2))-'0';
        if (sum%10==0) return true;
        return false;
    }
}
