/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01021_Tinh_luy_thua;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J01021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (1==1) {
            long a = in.nextLong(), b = in.nextLong();
            if (a==0 && b==0) break;
            else {
                System.out.println(Luy_thua.Res(a,b));
            }
        }
    }
}
