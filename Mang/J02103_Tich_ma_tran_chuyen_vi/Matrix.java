/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02103_Tich_ma_tran_chuyen_vi;

/**
 *
 * @author hoangduongngg
 */
public class Matrix {
    public static void tich_chuyen_vi (int a[][], int n, int m) {
        //tao ma tran chuyen vi b
        int [][] b = new int [m][n];
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                b[i][j]=a[j][i];
        
        //tao ma tran tich c
        int [][] c = new int [n][n];
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                for (int k=0; k<m; k++)
                    c[i][j] += a[i][k]*b[k][j];
        
        //print
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++)
                System.out.print(c[i][j]+ " ");
            System.out.println();
        }
        System.out.println();
               
    }
}
