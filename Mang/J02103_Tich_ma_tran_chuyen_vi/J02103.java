/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02103_Tich_ma_tran_chuyen_vi;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J02103 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        int k=1;
        while (t-->0) {
            System.out.println("Test "+k+":");
            k++;
            
            int n=in.nextInt(), m=in.nextInt();
            int[][] a = new int[n][m];
            for (int i=0; i<n; i++)
                for (int j=0; j<m; j++)
                    a[i][j] = in.nextInt();
            
            Matrix.tich_chuyen_vi(a,n,m);
        }
    }
}
