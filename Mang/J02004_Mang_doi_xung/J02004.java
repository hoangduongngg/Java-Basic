/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02004_Mang_doi_xung;

/**
 *
 * @author hoangduongngg
 */
import java.util.*;

public class J02004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            int a[] = new int[n+5];
            for (int i=0; i<n; i++) {
                a[i] = in.nextInt();
            }
            if (Doi_xung.Check(a,n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
        in.close();
    }
    
}
