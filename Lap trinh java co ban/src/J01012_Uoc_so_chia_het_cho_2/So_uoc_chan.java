/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01012_Uoc_so_chia_het_cho_2;

/**
 *
 * @author hoangduongngg
 */
public class So_uoc_chan {
    public static int Res(int n) {
        if (n%2==1) return 0;
        if (n==2) return 1;
        int count =1;
        if (Math.sqrt(n)%2==0) count++;
        for (int i=2; i<Math.sqrt(n); i++) {
            if (n%i==0) {
                if (i%2==0) count++;
                if ((n/i)%2==0) count++;
            }
        }
        return count;
    }
}
