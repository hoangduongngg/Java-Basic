/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02008_Boi__nho_nhat_cua_n_so_nguyen_duong_dau_tien;

import java.math.BigInteger;

/**
 *
 * @author hoangduongngg
 */
public class LCM {
    public static void N_so_dau_tien(int n) {
        long res=1;
        for (int i=2; i<=n; i++) {
            res = lcm(i, res);
        }
        System.out.println(res);
    }
    public static long lcm (long a, long b) {
        return a*b/gcdThing(a,b);
    }
    
//    public static long gcd (int a, int b) {
//        if (b==0) return a;
//        return gcd(b,a%b);
//    }
    
    private static long gcdThing (long a, long b) {
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger gcd = a1.gcd(b1);
        return gcd.longValue();
    }
    
}
