/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08020_kiem_tra_day_ngoac_dung;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author hoangduongngg
 */
public class J08020_Kiem_tra_day_ngoac_dung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            String s = in.nextLine();
            
        }
    }
    
    public static int Check_DauNgoac (String s) {
        Stack <Character> p = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                p.push(x);
            }
            else {
                if (p.empty()) return 0;
                else if (p.peek()=='(') {
                    
                }
            }
            
        }
    }
    
}
