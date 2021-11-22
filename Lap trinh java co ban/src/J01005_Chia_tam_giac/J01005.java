/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01005_Chia_tam_giac;

/**
 *
 * @author hoangduongngg
 */
import java.util.*;
public class J01005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while (t-->0) {
            double n = in.nextDouble();
            int h = in.nextInt();
            for (int i=1; i<n; i++) {
                System.out.printf("%.6f ",h*Math.sqrt(i/n));
            }
            System.out.println();
        }
    }
}
