/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tong_giai_thua;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J01009 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        System.out.println(tong_giaithua(n));
        
    }
    public static double tong_giaithua (int n) {
        double mod = Math.pow(10, 9) + 7;
        double res = 0;
        for (int i=1; i<=n; i++) {
            res =( res + giaithua(i)) % mod;
        }
        return res;
    }
    public static double giaithua (int n) {
        double res = 1;
        double mod = Math.pow(10, 9) + 7;
        for (int i=2; i<=n; i++) {
            res = (res*i)%mod;
        }
        return res;
        
    }
}
