/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4_So_La_Ma;

/**
 *
 * @author hoangduongngg
 */
public class So_La_Ma {
    public static int ChuyenDoi(String s) {
        int res=0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='I') {
                if (s.charAt(i+1)=='V') res+=4;
                else if (s.charAt(i)=='X') res+=9;
                else res+=1;
            }
            if (s.charAt(i)=='V') res+=5;
            if (s.charAt(i)=='X') {
                if (s.charAt(i+1)=='L') res+=40;
                else if (s.charAt(i)=='C') res+=90;
                else res+=10;
            }
            if (s.charAt(i)=='L') res+=50;
            if (s.charAt(i)=='C') {
                if (s.charAt(i+1)=='D') res+=400;
                else if (s.charAt(i)=='M') res+=900;
                else res+=100;
            }
            if (s.charAt(i)=='L') res+=50;
            
            
        }
        return res;
    }
}
