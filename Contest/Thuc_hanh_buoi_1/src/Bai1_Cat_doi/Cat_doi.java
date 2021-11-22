/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_Cat_doi;

import java.util.ArrayList;

/**
 *
 * @author hoangduongngg
 */
public class Cat_doi {
    public static void Do (String n) {
        int flag = 0;
        ArrayList<Character> res = new ArrayList<>();
        for (int i=0; i<n.length(); i++) {
            if (n.charAt(i)=='0' || n.charAt(i)=='8' || n.charAt(i)=='9') {
                res.add('0');
            }
            else if (n.charAt(i)=='1') {
                res.add('1');
            }
            else {
                System.out.println("INVALID");
                flag = -1;
                break;
            }
        }
        if  (res.contains('1')==false && flag==0) {
            System.out.println("INVALID");
            flag = -1;
        }
        if (flag==0) {
           // res.forEach(x -> System.out.print(x));
            int l = res.size();
            long ans=0;
            for (Character i:res) {
                int num = Integer.parseInt(String.valueOf(i));
                ans += num*Math.pow(10, l-1);
                l--;
            }
            System.out.println(ans);
        }
        
    }
}
