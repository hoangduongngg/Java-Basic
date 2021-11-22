/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3_So_uu_the;

/**
 *
 * @author hoangduongngg
 */
public class So_uu_the {
    public static int Check(String n) {
        int l=n.length();
        int check =0;   //chan-le
        for (int i=0; i<l; i++) {
            if (n.charAt(i)>'9' ||n.charAt(i)<'0' ) return 0;
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
            if (num%2==0) check+=1;
            else check-=1;
        }
        if (l%2==0 && check>0) return 1;
        else if (l%2==1 && check<0) return 1;
        else return 2;
        
        
    }
}
