package j01009_tong_giai_thua;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J01009_tong_giai_thua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        record in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Tong_gthua(n));
    }
    
    public static long Tong_gthua(int n) {
        long res = 0;
        //long mod = (long) Math.pow(10, 9) +7;
        for (int i=1; i<=n; i++) 
            res = (res+ gt(i));
        return res;
    }
    
    public static long gt (int n) {
        long res = n;
        //long mod = (long) Math.pow(10, 9) +7;
        for (int i=2; i<n; i++)
            res = res*i;
        return res;
    }
}
