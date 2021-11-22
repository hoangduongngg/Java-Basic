/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class HELLOFILE {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File ("Hello.txt"));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }
    
}
