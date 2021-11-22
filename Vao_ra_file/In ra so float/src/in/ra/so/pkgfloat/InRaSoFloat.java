/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ra.so.pkgfloat;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class InRaSoFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String gpa = in.nextLine();
        try {
            if (Integer.parseInt(gpa) == Double.parseDouble(gpa)) {
                System.out.println(Integer.parseInt(gpa));
            }
        
        } catch (Exception e) {
            System.out.println(gpa);

        }
        
    }
    
}
