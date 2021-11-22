/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01021_Tinh_luy_thua;

/**
 *
 * @author hoangduongngg
 */
public class Luy_thua {
    public static double Res (long a, long b) {
        double res = Math.pow(a, b);
        double mod = Math.pow(10, 9)+7;
        res%=mod;
        return res;
    }
}
