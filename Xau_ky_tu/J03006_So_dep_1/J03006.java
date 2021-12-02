/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03006_So_dep_1;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J03006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            String n = in.next();
            if (So_dep_1.Check(n)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
