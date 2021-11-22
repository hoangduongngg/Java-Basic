/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08021_day_ngoac_dung_dai_nhat;

import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J08021_Day_ngoac_dung_dai_nhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            String s = in.nextLine();
            System.out.println(MaxDayNgoacDung(s));
        }
    }

    public static int MaxDayNgoacDung(String s) {
        int res = 0;
        Stack <Integer> p = new Stack<>();
        p.push(-1);
        
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                p.push(i);
            }
            else {
                p.pop();
                if (!p.empty()) {
                    res = Math.max (res, i - p.peek());
                }
                else {
                    p.push(i);
                }
            }
        }
        return res;
    }
    
}
