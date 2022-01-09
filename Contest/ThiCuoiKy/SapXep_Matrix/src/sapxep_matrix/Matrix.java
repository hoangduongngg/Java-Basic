/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_matrix;

/**
 *
 * @author hoangduongngg
 */
public class Matrix {
    private Integer n, m, i;

    public Matrix(String inputString, String MatrixString) {
        String[] ip = inputString.split(" ");
        this.n = Integer.parseInt(ip[0]); //hang
        this.m = Integer.parseInt(ip[1]);//cot
        this.i = Integer.parseInt(ip[2]);//cot can sort
        
        
    }
    
    
    
}
