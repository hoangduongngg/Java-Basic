package j01021_tinh_luy_thua;

import java.util.Scanner;
/**
 *
 * @author hoangduongngg
 */
public class J01021_Tinh_luy_thua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = in.nextInt();
            long b = in.nextLong();
            if (a==0 && b==0) break;
            System.out.println(powerMod(a,b));
        }
    }
    
    public static long powerMod (int a, long b) {
        if (b==0) return 1;
        long mod = (long) Math.pow(10, 9) +7;
        long x = powerMod(a, b/2);
        if (b%2==0) return x*x%mod;
        return a*(x*x%mod)%mod;
    }
}
