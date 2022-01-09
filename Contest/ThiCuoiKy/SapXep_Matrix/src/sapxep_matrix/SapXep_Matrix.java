/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_matrix;

import java.io.*;
import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class SapXep_Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<Matrix> ds = new ArrayList<>();
        while (t-->0) {
            ds.add(new Matrix(in.nextLine(), in.nextLine()));
        }
        
        for (Matrix x:ds) {
            System.out.println(x);
        }
    }
    
}
