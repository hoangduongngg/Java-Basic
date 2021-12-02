/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03025_Xau_doi_xung;

/**
 *
 * @author hoangduongngg
 */
public class Xau_doi_xung {
    public static boolean Check (String s) {
        int count = 0;  //dem so cap khac nhau
        for (int i=0; i<s.length()/2; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) count+=1;
            if (count>1) return false;
        }
        if (count==0 && s.length()%2==0) return false;
        return true;
    }
}
